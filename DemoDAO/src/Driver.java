
public class Driver {

	public static void main(String[] args) {
		StudenteDAO SD;
		
		//if parametro di configurazione = Oracle
			SD =new StudenteDAOOracleImp1();
		//else if parametro = Web
			SD =new StudenteDAOWebImp();
		
		Studente s = SD.getStudenteByMatricola("N86003335");
		System.out.println(s);

	}

}
