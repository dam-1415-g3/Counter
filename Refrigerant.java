
public class Refrigerant extends Contenidor{
	
	private int temperatura;



	public Refrigerant(String numSerie, String estat,int capacitat,Mercaderias[] mercaderias,int temperatura) {
		super(numSerie, estat, capacitat, mercaderias);
		this.temperatura = temperatura;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	

}
