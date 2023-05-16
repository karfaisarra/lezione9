package lezione9.telefono;

public class ContrattoTelefonico {
	
	protected int numeroTel;
	protected String utente;
	protected double costoTelefonate;
	protected int numTelefonate;
	private final double COSTO_AL_SECONDO;
	
	public ContrattoTelefonico(int numeroTel, String utente) {
		this.numeroTel=numeroTel;
		this.utente=utente;
		this.costoTelefonate=0;
		this.numTelefonate=0;
		COSTO_AL_SECONDO=0;
	}
	
	public void aggiornaBolletta(int numSecondi) {
		this.costoTelefonate += numSecondi * COSTO_AL_SECONDO;
		numTelefonate++;
	}
	
	public void aggiungiCosti(double costo) {
		double numSecondi = costo / COSTO_AL_SECONDO;
		this.costoTelefonate += numSecondi * COSTO_AL_SECONDO;
		numTelefonate++;
	}

	public int getNumeroTel() {
		return numeroTel;
	}

	public String getUtente() {
		return utente;
	}

	public double getCostoTelefonate() {
		return costoTelefonate;
	}

	public int getNumTelefonate() {
		return numTelefonate;
	}
	
	public double getCOSTO_AL_SECONDO() {
		return COSTO_AL_SECONDO;
	}
	
	@Override
	public String toString() {
	    return "Numero di telefono: " + numeroTel + ", Utente: " + utente;
	}
}
