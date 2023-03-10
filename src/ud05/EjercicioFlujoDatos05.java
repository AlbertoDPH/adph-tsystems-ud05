package ud05;

import java.util.Scanner;

public class EjercicioFlujoDatos05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero;

		System.out.print("Introduce un número: ");
		numero = scan.nextInt();

		if (numero % 2 == 0)
			System.out.println("\nEl número " + numero + " es divisible entre 2");

		else
			System.out.println("\nEl número " + numero + " NO es divisible entre 2");
		
		scan.close();
	}
}
