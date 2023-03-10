package ud05;

import java.util.Scanner;

public class EjercicioFlujoDatos11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String dia = "";

		System.out.println("Introduce día de la semana:");
		dia = scan.nextLine();

		switch (dia) {

		case "Lunes":
			System.out.println(dia + " es una día Laboral");
			break;
		case "Martes":
			System.out.println(dia + " es una día Laboral");
			break;
		case "Miércoles":
			System.out.println(dia + " es una día Laboral");
			break;
		case "Jueves":
			System.out.println(dia + " es una día Laboral");
			break;
		case "Viernes":
			System.out.println(dia + " es una día Laboral");
			break;
		case "Sábado":
			System.out.println(dia + " NO es una día Laboral");
			break;
		case "Domingo":
			System.out.println(dia + " NO es una día Laboral");
			break;
		default:
			System.err.print("El día de la semana " + dia + " no es correcto."
					+ "\nComprueba que la primera letra esté en mayúsculas y los acentos estén bien puestos."
					+ "\nEj: Sábado");

		}
		scan.close();

	}

}
