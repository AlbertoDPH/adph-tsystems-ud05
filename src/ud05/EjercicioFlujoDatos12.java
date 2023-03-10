package ud05;

import java.util.Scanner;

public class EjercicioFlujoDatos12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String password = "Qw1234";
		String passUsuario = "";
		int intentos = 3;

		do {

			System.out.println("Introduce la contraseña (tienes 3 intentos): ");
			passUsuario = scan.nextLine();

			intentos--;

			if (password.equals(passUsuario))
				System.out.println("Enhorabuena!!");

			else
				System.err.println("Contraseña incorrecta, te quedan " + intentos + " intentos.");

		} while (intentos != 0);

	}

}
