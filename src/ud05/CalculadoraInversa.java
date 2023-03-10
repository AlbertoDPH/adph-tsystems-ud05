package ud05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculadoraInversa {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1;
		int num2;
		double resultado = 0;
		String signo = "";

		System.out.println("Introduce número 1:");
		num1 = scan.nextInt();

		System.out.println("Introduce número 2:");
		num2 = scan.nextInt();

		System.out.println("Introduce signo aritmético: '+ - * / ^ %': ");
		signo = scan.next();

		switch (signo) {

		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		case "^":
			resultado = Math.pow(num1, num2);
			break;
		case "%":
			resultado = num1 % num2;
			break;
		default:
			// Muestra mensaje de error en el caso de que signo no sea valido.
			System.err.println("El signo aritmético " + signo + " NO es válido");

			/*
			 * Hace un cierre forzado para que no se ejecute la ventana de diálogo, en el
			 * caso de que el signo aritmético nos ea valido.
			 */
			System.exit(0);

		}

		JOptionPane.showMessageDialog(null,
				"El resultado de la operación:" + "\n" + num1 + " " + signo + " " + num2 + " = " + resultado);

	}

}
