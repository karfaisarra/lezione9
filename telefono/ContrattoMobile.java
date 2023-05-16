package lezione9.telefono;

public class ContrattoMobile extends ContrattoTelefonico {
	
	private final double COSTO_RISPOSTA;
	
	public ContrattoMobile(int numeroTel, String utente, double COSTO_AL_SECONDO) {
		super(numeroTel, utente);
		this.COSTO_RISPOSTA=COSTO_AL_SECONDO;
	}

	@Override
	public void aggiornaBolletta(int numSecondi) {
		this.costoTelefonate += numSecondi * COSTO_RISPOSTA;
		numTelefonate++;
	}
	
	
}