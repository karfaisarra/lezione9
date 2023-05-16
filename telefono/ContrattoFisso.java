package lezione9.telefono;

public class ContrattoFisso extends ContrattoTelefonico {
	
	private String indirizzo;

	public ContrattoFisso(int numeroTel, String utente, String indirizzo) {
		super(numeroTel, utente);
		this.indirizzo=indirizzo;
	}
	
	@Override
	public String toString() {
	    return super.toString() + ", Indirizzo: " + indirizzo;
	}
}
