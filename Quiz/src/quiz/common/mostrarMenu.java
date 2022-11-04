package quiz.common;

import java.io.IOException;
import java.util.Scanner;

public class mostrarMenu {


	public mostrarMenu() throws IOException {

		try (Scanner input = new Scanner (System.in)) {
		int opcion = -1;

		do{
		    System.out.println(" Quiz 9-10 ");

		    System.out.println("1. Descripcion.");
		    System.out.println("2. Subtitulos.");
		    System.out.println("3. Descripcion.");

		    System.out.println("0. Salir");

		    System.out.print("Seleccione el procesador de video: ");
		    opcion = Integer.parseInt(input.next());

		    procesarOpcion(opcion);

		}while(opcion !=0);
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static void procesarOpcion(int opcion) throws IOException{
    switch(opcion){
        case 1:
            //jugar();
            break;
        case 2:
            //jugar();
            break;
        case 3:
            //jugar();
            break;
        case 0:
            break;
        default:
            System.out.println("Opción invalida!");
            break;
        }

	}
}