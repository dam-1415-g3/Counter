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

}