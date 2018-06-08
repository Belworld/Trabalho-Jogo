package Dados;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JRadioButton;

public class Telainicial extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telainicial frame = new Telainicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Telainicial() {
		setBackground(Color.YELLOW);
		setForeground(Color.YELLOW);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Qual \u00E9 o seu nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setForeground(new Color(0, 51, 51));
		lblNewLabel.setBounds(10, 100, 154, 26);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(174, 106, 163, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Escolhe uma categoria:");
		lblNewLabel_1.setForeground(new Color(0, 51, 51));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 154, 154, 26);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Historia");
		rdbtnNewRadioButton.setBounds(193, 158, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Esporte");
		rdbtnNewRadioButton_1.setBounds(193, 192, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Politica");
		rdbtnNewRadioButton_2.setBounds(193, 231, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Bem Vindo ao Jogo");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.ITALIC, 24));
		lblNewLabel_2.setBounds(80, 11, 271, 35);
		contentPane.add(lblNewLabel_2);
		
		ButtonGroup Assuntos = new ButtonGroup();
		Assuntos.add(rdbtnNewRadioButton);
		Assuntos.add(rdbtnNewRadioButton_1);
		Assuntos.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("QUITZ");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.ITALIC, 32));
		lblNewLabel_3.setBounds(156, 43, 129, 38);
		contentPane.add(lblNewLabel_3);
		
		
		rdbtnNewRadioButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Pergunta p1 = new Pergunta("", "", "", "", "", "");
				new Exibir().setVisible(true);;
				setVisible(false);
			}
		});
	}
}
