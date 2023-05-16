package lezione9;

public class LibriCat extends Libri{

	public LibriCat(String titolo, int anno, int costo) {
		super(titolo, anno, costo);
	}

	@Override
	public boolean stessocosto(Libri l) {
		return l.costo==this.costo;
	}

}
