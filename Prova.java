package lezione9;

public class Prova {

	public static void main(String[] args) {
		Libri l1 = new LibriCat("Nome della Rosa", 1986, 20);
	    Libri l2 = new LibriCat("Anna Karenina", 1877, 20);

	    if (l1.stessocosto(l2)) {
	      System.out.println("I libri hanno lo stesso costo.");
	    } else {
	      System.out.println("I libri non hanno lo stesso costo.");
	    }
	}

}
