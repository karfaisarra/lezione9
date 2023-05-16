package lezione9.prodotti;

public class UsaProdotti {
	public static void main(String[] args) {
		
		Prodotto p1=new Prodotto("Prodotto 1", 14.99, 6);
		System.out.println("Descrizione: " + p1.getDescrizione());
		System.out.println("Prezzo: " + p1.getPrezzo());
		System.out.println("Quantita disponibile: " + p1.getQuantitaDispo());
		p1.rifornisci(4);
		System.out.println("Quantita disponibile: " + p1.getQuantitaDispo());
		p1.vendi();
		System.out.println("Quantita disponibile: " + p1.getQuantitaDispo());
		
		ProdottoScontabile p2=new ProdottoScontabile("Prodotto 2", 24.99, 10, 5, 0.2);
		System.out.println("Descrizione: " + p2.getDescrizione());
		System.out.println("Prezzo: " + p2.getPrezzo());
		System.out.println("Quantita disponibile: " + p2.getQuantitaDispo());
		System.out.println("Quantita per applicare lo sconto: " + p2.getQuantitaSconto());
		System.out.println("Sconto: " + p2.getSconto());
		p2.rifornisci(10);
		System.out.println("Quantita disponibile: " + p2.getQuantitaDispo());
		p2.vendi(7);
		System.out.println("Quantita disponibile: " + p2.getQuantitaDispo());
	}
}
