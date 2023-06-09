package lezione9.banca;

public class ContoEsteso extends ContoBancario {
	
	private int fido;
	
	public ContoEsteso(String numero) {
		super(numero);
		this.fido=1000;
	}
	
	public ContoEsteso(String numero, int bilancio) {
		super(numero, bilancio);
		this.fido=1000;
	}

	public ContoEsteso(String numero, int bilancio, int fido) {
		super(numero, bilancio);
		this.fido=fido;
	}

	public int getFido() {
		return fido;
	}

	public void nuovoFido(int fido) {
		this.fido = fido;
	}
	
	//@Override
	public boolean preleva(int ammontare) {
		if(ammontare>getBilancio() && this.fido>=(getBilancio() - ammontare)) {
			return false;
		}else {
			setBilancio(getBilancio() - ammontare);
			return true;
		}
	}
}
