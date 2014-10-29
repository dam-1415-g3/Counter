import java.util.Arrays;


public class Contenidor {
	
	private String numSerie, estat="obert";
	private int capacitat;
	private final int MAX_MERCADERIAS = 100;
	private Mercaderias[] mercaderias = new Mercaderias[MAX_MERCADERIAS];
	
	
	public Contenidor(String numSerie, String estat, int capacitat,
			Mercaderias[] mercaderias) {
		super();
		this.numSerie = numSerie;
		this.estat = estat;
		this.capacitat = capacitat;
		this.mercaderias = mercaderias;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getEstat() {
		return estat;
	}

	public void setEstat(String estat) {
		this.estat = estat;
	}

	public int getCapacitat() {
		return capacitat;
	}

	public void setCapacitat(int capacitat) {
		this.capacitat = capacitat;
	}

	public Mercaderias[] getMercaderias() {
		return mercaderias;
	}

	public void setMercaderias(Mercaderias[] mercaderias) {
		this.mercaderias = mercaderias;
	}

	@Override
	public String toString() {
		return "Contenidor [mercaderias=" + Arrays.toString(mercaderias) + "]";
	}
	

	
	
	

}
