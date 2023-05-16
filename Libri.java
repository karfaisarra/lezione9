package lezione9;

public abstract class Libri {
	
	private String titolo;
	private int anno;
	protected int costo;
	
	public Libri(String titolo, int anno, int costo) {
		this.titolo=titolo;
		this.anno=anno;
		this.costo=costo;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public int getAnno() {
		return anno;
	}
	
	public abstract boolean stessocosto(Libri l);
	
}
