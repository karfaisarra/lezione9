package lezione9.prodotti;

public class ProdottoScontabile extends Prodotto {
	
	private int quantitaSconto;
	private double sconto;
	
	public int getQuantitaSconto() {
		return quantitaSconto;
	}

	public double getSconto() {
		return sconto;
	}

	public ProdottoScontabile(String descrizione, double prezzo, int quantitaSconto, double sconto) {
		super(descrizione, prezzo);
		this.quantitaSconto=quantitaSconto;
		this.sconto=sconto;
	}
	
	public ProdottoScontabile(String descrizione, double prezzo, int quantita, int quantitaSconto, double sconto) {
		super(descrizione, prezzo, quantita);
		this.quantitaSconto=quantitaSconto;
		this.sconto=sconto;
	}
	
	//@Override
	public boolean vendi(int quantita) {
        if (quantitaDispo >= quantita) {
            double prezzoTotale = prezzo * quantita;
            if (quantita > quantitaSconto) {
                prezzoTotale -= prezzo * quantita * sconto;
            }
            System.out.println("Hai venduto " + quantita + " " + descrizione + " per " + prezzoTotale + " euro.");
            quantitaDispo -= quantita;
            return true;
        } else {
            return false;
        }
	}
}
