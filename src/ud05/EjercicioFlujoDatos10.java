package ud05;

import java.util.Scanner;

public class EjercicioFlujoDatos10 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numVentas;
		double valorVenta = 0;

		System.out.print("Introduce número de ventas: ");
		numVentas = scan.nextInt();

		System.out.println();
		
		for (int i = 0; i < numVentas; i++) {

			System.out.print("Venta número " + (i + 1) + ": ");
			valorVenta = scan.nextDouble();

			valorVenta += valorVenta;
		}
		
		System.out.print("\nEl valor de todas las ventas es: " + valorVenta );
		
		scan.close();

	}
}
