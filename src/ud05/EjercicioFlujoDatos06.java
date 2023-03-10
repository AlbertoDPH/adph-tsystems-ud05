package ud05;

import java.util.Scanner;

public class EjercicioFlujoDatos06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final double IVA = 0.21;

		double precio;

		System.out.print("Introduce precio: ");
		precio = scan.nextDouble();

		System.out.print("\nEl precio con IVA incluido es: " + (precio + (precio * IVA)));
		
		scan.close();

	}

}
