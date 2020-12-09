import java.util.*;

public class StudenteDAOOracleImp1 implements StudenteDAO {
	
	@Override
	public boolean SalvaStudente(Studente s) {
		//Codice per salvare sul DB lo studente s
		
		System.out.println("Ho salvato lo Studente nel DB");	//mai fare nel codice reale dei println
		return true;
	}
	
	@Override
	public Studente getStudenteByMatricola(String matricola) {
		//Eseguo query sul db, con where per la matricola
		//Scandisco il ResulSet, che dovrebbe avere tra 0 e 1 studenti
		//Se il resulset contiene un rigo, creo uno studente con i valori presi dal resultset
		System.out.println("Ho letto dal DB Oracle una tupla di studente e la restituisco");	//mai fare nel codice reale dei println
		
		
		String matr = "N86003335"; //primo campo resulset rs.getString("Matricola")
		String nome = "N86003335"; //primo campo resulset rs.getString("Nome")
		String cognome = "N86003335"; //primo campo resulset rs.getString("Cognome")
		
		
		Studente s = new Studente (matr, nome, cognome);
		return s;
	}
	
	@Override
	public List<Studente> getStudenteByCdl(String Cdl){
		//Eseguo query sul db, con where per la matricola LIKE "Cdl%"
		//Scandisco il ResulSet, che dovrebbe avere tra 0 e n valori
		//Se il resulset contiene valori, creo una collection di studente con i valori presi dal resultset
		
		ArrayList<Studente> theList = new ArrayList<Studente>();
		Studente s1 = new Studente ("N86003335", "Mario", "Rossi");
		Studente s2 = new Studente ("N86003785", "Marco", "Bianchi");
		
		theList.add(s1);
		theList.add(s2);
		return theList;
	}
	
	
}
