import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class testProva {
	
	static Scanner lector;

	public static void main(String[] args) {
		
		
		lector = new Scanner(System.in);
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
				
			case 2:
				
				break;
			case 3:
				
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

}