package lezione9.banca;

public class ProvaContoEsteso {

	public static void main(String[] args) {
		
		ContoEsteso conto = new ContoEsteso("123456", 1200, 800);
		System.out.println(conto.getBilancio());
		conto.deposita(300);
		System.out.println(conto.getBilancio());
		conto.preleva(500);
		System.out.println(conto.getBilancio());
	}

}
