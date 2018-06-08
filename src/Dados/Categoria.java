package Dados;

import java.util.ArrayList;

public class Categoria {
	private String Titulo;
	
	private ArrayList<Pergunta> Perguntas = new ArrayList<>();
	
	public Categoria(String titulo, ArrayList<Pergunta> perguntas) {
		super();
		Titulo = titulo;
		Perguntas = perguntas;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public ArrayList<Pergunta> getPerguntas() {
		return Perguntas;
	}

	public void setPerguntas(ArrayList<Pergunta> perguntas) {
		Perguntas = perguntas;
	}

	


}
