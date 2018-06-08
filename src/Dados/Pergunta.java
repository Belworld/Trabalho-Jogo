package Dados;

import java.util.ArrayList;

public class Pergunta {
	
	private String perg;
	private String Alt1;
	private String Alt2;
	private String Alt3;
	private String Alt4;
	
	private String Altercoreta;
		
		
	public Pergunta(String perg, String alt1, String alt2, String alt3, String alt4, String altercoreta) {
		super();
		this.perg = perg;
		Alt1 = alt1;
		Alt2 = alt2;
		Alt3 = alt3;
		Alt4 = alt4;
		Altercoreta = altercoreta;
	}


	public String getPerg() {
		return perg;
	}


	public void setPerg(String perg) {
		this.perg = perg;
	}


	public String getAlt1() {
		return Alt1;
	}


	public void setAlt1(String alt1) {
		Alt1 = alt1;
	}


	public String getAlt2() {
		return Alt2;
	}


	public void setAlt2(String alt2) {
		Alt2 = alt2;
	}


	public String getAlt3() {
		return Alt3;
	}


	public void setAlt3(String alt3) {
		Alt3 = alt3;
	}


	public String getAlt4() {
		return Alt4;
	}


	public void setAlt4(String alt4) {
		Alt4 = alt4;
	}


	public String getAltercoreta() {
		return Altercoreta;
	}


	public void setAltercoreta(String altercoreta) {
		Altercoreta = altercoreta;
	}


}

	