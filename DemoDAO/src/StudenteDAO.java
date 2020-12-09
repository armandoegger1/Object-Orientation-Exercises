import java.util.List;

public interface StudenteDAO {

	boolean SalvaStudente(Studente s);

	Studente getStudenteByMatricola(String matricola);

	List<Studente> getStudenteByCdl(String Cdl);

}