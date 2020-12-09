
public class Studente {
	
	//Attributi
	private String Matricola;
	private String Cognome;
	private String Nome;
	
	//Costruttore
	public Studente(String matricola, String cognome, String nome) {
		super();
		Matricola = matricola;
		Cognome = cognome;
		Nome = nome;
	}
	
	//Metodi
	public String getMatricola() {
		return Matricola;
	}
	public void setMatricola(String matricola) {
		Matricola = matricola;
	}

	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}

	
	
}
