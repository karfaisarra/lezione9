package lezione9.banca;

public class ContoBancario {
	
	private String numero;
	private int bilancio;
	
	public ContoBancario(String numero) {
		this.numero=numero;
		this.bilancio=0;
	}
	
	public ContoBancario(String numero, int bilancio) {
		this.numero=numero;
		this.bilancio=bilancio;
	}
	
	public String getNumeroConto() {
		return numero;
	}
	
	public int getBilancio() {
		return bilancio;
	}
	
	public void deposita(int ammontare) {
		bilancio+=ammontare;
	}
	
	public boolean preleva(int ammontare) {
		if(ammontare>bilancio) {
			return false;
		}else {
			bilancio = bilancio - ammontare;
			return true;
		}
	}
	
	public void setBilancio(int bilancio) {
		this.bilancio=bilancio;
	}
}
