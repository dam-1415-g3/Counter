
public class Vaixell {

	private final int MAX_CONTENIDOR=1000;
	private Contenidor[] contenidor = new Contenidor[MAX_CONTENIDOR];
	
	
	public Vaixell() {
		super();
	}


	public Vaixell(Contenidor[] contenidor) {
		super();
		this.contenidor = contenidor;
	}


	public Contenidor[] getContenidor() {
		return contenidor;
	}


	public void setContenidor(Contenidor[] contenidor) {
		this.contenidor = contenidor;
	}
	
	
	
	
	
	
	
	
}
