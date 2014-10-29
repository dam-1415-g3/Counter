import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class testPortBCN {
	
	static Scanner lector;

	public static void main(String[] args) {
		
		Vaixell vaixell = new Vaixell();
		Mercaderias mercaderia = new Mercaderias();
		lector = new Scanner(System.in);
		Contenidor[] contenidor = new Contenidor[1000];
		int posicio=0;
		int valor = 0, valor1 = 0;
		
		do {

			do {
				System.out.println("MENÚ D'OPCIONS:");
				System.out.println();
				System.out.println("1-CARREGAR CONTENIDOR");
				System.out.println("2-DESCARREGAR VAIXELL");
				System.out.println("3-MOSTRAR ONTENIDORS");
				System.out.println("0-SORTIR");
				valor = Integer.parseInt(lector.nextLine());
			} while (valor < 0 && valor > 3);
			switch (valor) {
			case 1:
				do {
					
					System.out.println("QUIN CONTENIDOR VOLS AFEGIR?");
					System.out.println();
					System.out.println("1-Dry Van");
					System.out.println("2-Cisterna");
					System.out.println("3-Refrigerat");
					System.out.println("0-Tornar");
					valor1 = Integer.parseInt(lector.nextLine());
				} while (valor < 0 && valor > 3);
				switch (valor1) {
				case 1:
					crearDryVan(contenidor, posicio);	
					posicio++;
					break;
				case 2:
					crearCisterna(contenidor, posicio);	
					posicio++;
					break;
				case 3:
					crearRefrigerant(contenidor, posicio);
					posicio++;
					break;

				case 0:
					break;
				}
				break;
			case 2:
				descarregarVaixell(contenidor, posicio);
				posicio=0;
				break;
			case 3:
				mostrarContenidor(contenidor, posicio);
				break;
			case 4:
				break;

			}

		} while (valor != 0);

	}
	
	public static void crearDryVan(Contenidor[] contenidor, int posicio){
		int  capacitat, nMercaderias;
		String numSerie, color, estat;		
		
		System.out.println("Numero de seire:");
		numSerie = lector.nextLine();
		System.out.println("Capacitat:");
		capacitat = Integer.parseInt(lector.nextLine());
		System.out.println("Color:");
		color = lector.nextLine();
		System.out.println("Quantes mercaderies vols entrar?");
		nMercaderias = Integer.parseInt(lector.nextLine());
		if (nMercaderias <= 100){
		Mercaderias[] mercaderia = new Mercaderias[nMercaderias];
		crearMercaderias(nMercaderias,capacitat,mercaderia);
		estat="tancat";
		contenidor[posicio]= new DryVan(numSerie,estat,capacitat,mercaderia,color);
		}
		else {
			System.out.println("No i caben tantes mercaderias");
		}
	}
	
	public static void crearCisterna(Contenidor[] contenidor, int posicio){
		System.out.println(posicio);
		String numSerie, estat;
		int capacitat,nMercaderias;
		
		System.out.println("Numero de serie:");
		numSerie=lector.nextLine();
		System.out.println("Capacitat");
		capacitat = Integer.parseInt(lector.nextLine());
		System.out.println("Quantes mercaderias vols entrar?");
		nMercaderias=Integer.parseInt(lector.nextLine());
		if(nMercaderias==1){
			Mercaderias[] mercaderia = new Mercaderias[nMercaderias];
			crearMercaderias(nMercaderias,capacitat,mercaderia);
			estat="tancat";
			contenidor[posicio]=new Cisterna(numSerie,estat,capacitat,mercaderia);
		}
		else{
			System.out.println("No i caben les mercaderias");
		}
		
	}
	
	public static void crearRefrigerant(Contenidor[] contenidor, int posicio){
		System.out.println("Numero de serie:");
		String numSerie=lector.nextLine();
		System.out.println("Capacitat");
		int capacitat = Integer.parseInt(lector.nextLine());
		System.out.println("Temperatura");
		int temperatura=Integer.parseInt(lector.nextLine());
		System.out.println("Quantes mercaderias vols entrar?");
		int nMercaderias=Integer.parseInt(lector.nextLine());
		if(nMercaderias<=100){
			Mercaderias[] mercaderia = new Mercaderias[nMercaderias];
			crearMercaderias(nMercaderias,capacitat,mercaderia);
			String estat="tancat";
			contenidor[posicio]=new Refrigerant(numSerie,estat,capacitat,mercaderia,temperatura);
		}
		else{
			System.out.println("No i caben les mercaderias");
		}
	}
	
	public static void crearMercaderias(int nMercaderias, int volumM, Mercaderias[] mercaderia){
		
		int volum,pos=0,suma=0;
		String descripcio;
		
		Mercaderias[] mercaderiasAux = new Mercaderias[nMercaderias];
		
		for (int i=0;i<nMercaderias;i++){
			System.out.println("NOVA MERCADERIA");
			System.out.println("Descripció");
			descripcio = lector.nextLine();
			System.out.println("Volum");
			volum=Integer.parseInt(lector.nextLine());
			mercaderiasAux[pos++] = new Mercaderias(descripcio,volum);
			suma += volum;
		}
		 if (suma<=volumM){
			 for(int x=0;x<nMercaderias;x++){
				 mercaderia[x]=mercaderiasAux[x];
				 
			 }
		 }else{
			 System.out.println("No hi cap tant volum");
		 }
		
		
	}
	
	
	public static String data(){
		String data;
		Calendar dates = new GregorianCalendar();
		int any = dates.get(Calendar.YEAR);
		int mes = dates.get(Calendar.MONTH);
		int dia = dates.get(Calendar.DAY_OF_MONTH);
		data = "DATA: " + String.valueOf(dia)+"/" + String.valueOf(mes) +"/"+ String.valueOf(any);
		return data;
		
	}
	
	public static void descarregarVaixell(Contenidor[] cont,int posicio){
		int suma =0;
		System.out.println("PORT DE BARCELONA" + "\n");
		System.out.println(data() + "\n");
		System.out.println("CONTENIDOR"+"\t"+"VOLUM");
		System.out.println("----------------------------");
		for (int i=0;i<posicio;i++){
			System.out.println(cont[i].getNumSerie()+"\t"+"\t" + cont[i].getCapacitat() + " md3");
			suma += cont[i].getCapacitat();
		}
		System.out.println("VOLUM TOTAL: "+ suma + " md3");
	}
	
	public static void mostrarContenidor(Contenidor[] cont, int posicio){
		System.out.println("PORT DE BARCELONA" + "\n");
		System.out.println(data() + "\n");
		System.out.println("CONTENIDOR"+"\t"+"VOLUM");
		System.out.println("----------------------------");
		
		
		
		
		for (int i=0;i<posicio;i++){
			System.out.println(cont[i].getNumSerie()+"\t"+"\t"+cont[i].getMercaderias() + " md3");
		}
	}

	
	
	
}
