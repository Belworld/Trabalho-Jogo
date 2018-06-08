package Dados;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Exibir extends JFrame {

	protected static final String Alt2 = null;
	private JPanel contentPane;

	
	 private int cont;
	public Exibir() {
		cont=0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPergunta = new JLabel("Pergunta :");
		lblPergunta.setBounds(22, 53, 84, 14);
		contentPane.add(lblPergunta);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Alt1");
		rdbtnNewRadioButton.setBounds(96, 49, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Alt2");
		rdbtnNewRadioButton_1.setBounds(96, 75, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Alt3");
		rdbtnNewRadioButton_2.setBounds(96, 101, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Alt4");
		rdbtnNewRadioButton_3.setBounds(96, 127, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		ButtonGroup Alternativas = new ButtonGroup();
		Alternativas.add(rdbtnNewRadioButton);
		Alternativas.add(rdbtnNewRadioButton_1);
		Alternativas.add(rdbtnNewRadioButton_2);
		Alternativas.add(rdbtnNewRadioButton_3);
		
		
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			int cont = 1;
			String	pergunta1 = rdbtnNewRadioButton.getText() ;
			
			String pergunta2 = rdbtnNewRadioButton_1.getText();
			
			String pergunta3 = rdbtnNewRadioButton_2.getText();
			
			
			
			
			if(cont <= 20) {							
			if ((pergunta1.equals(rdbtnNewRadioButton.getText())&&rdbtnNewRadioButton.isSelected())
			||(pergunta1.equals(rdbtnNewRadioButton_1.getText())&&rdbtnNewRadioButton_1.isSelected())
			||(pergunta1.equals(rdbtnNewRadioButton_2.getText())&&rdbtnNewRadioButton_2.isSelected())
			||(pergunta1.equals(rdbtnNewRadioButton_3.getText())&&rdbtnNewRadioButton_3.isSelected()))
			
			{
				
			JOptionPane.showMessageDialog(null, "reposta certo");
			cont++;
				
			}else{
				JOptionPane.showMessageDialog(null, "resposta errado");
				cont++;
			}
			
			
		
			}
			
			if(cont==1) {
				
				
				rdbtnNewRadioButton_1.setText("");
				
				setVisible(false);
				setVisible(true);			
			
			
			
			
				
			}
			if (cont ==2) {
				rdbtnNewRadioButton_2.setText("");
				
				setVisible(false);
				setVisible(true);
			}
				
			}
			
			
		});
		btnNewButton.setBounds(71, 170, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pular");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(194, 170, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
		
		
		
		
		
	}
}
