package lezione9.prodotti;

public class Prodotto {
	
	protected String descrizione;
	protected double prezzo;
	protected int quantitaDispo;
	
	public String getDescrizione() {
		return descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public int getQuantitaDispo() {
		return quantitaDispo;
	}

	public Prodotto(String descrizione, double prezzo) {
		this.descrizione=descrizione;
		this.prezzo=prezzo;
		this.quantitaDispo=0;
	}
	
	public Prodotto(String descrizione, double prezzo, int quantita) {
		this.descrizione=descrizione;
		this.prezzo=prezzo;
		this.quantitaDispo=quantita;;
	}
	
	public void rifornisci(int quantita) {
		this.quantitaDispo+=quantita;			

	}
	public boolean vendi() {
		if(quantitaDispo>0) {
			System.out.println("Hai venduto " + descrizione + " per " + prezzo + " euro.");
			quantitaDispo--;
            return true;
		}else {
			return false;
		}
	}
}
