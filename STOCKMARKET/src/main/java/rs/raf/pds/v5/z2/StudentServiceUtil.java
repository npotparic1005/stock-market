package rs.raf.pds.v5.z2;

public class StudentServiceUtil {

	public static int getMesec(String sifraIspita) {
		int mesecPos = sifraIspita.indexOf('_');
		String mesec = sifraIspita.substring(mesecPos+1, mesecPos+3);
		
		return Integer.parseInt(mesec);
	}
	public static int getGodina(String sifraIspita) {
		int godPos = sifraIspita.lastIndexOf('_');
		String god = sifraIspita.substring(godPos+1);
		
		return Integer.parseInt(god);
	}
	
}
