package ud05;

import javax.swing.JOptionPane;

public class EjercicioFlujoDatos04 {
	public static void main(String[] args) {

		final double PI = Math.PI;

		double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce radio del círculo"));

		double calculoRadio = Math.pow(PI, radio);

		System.out.println("El área del circulo con radio: " + radio + " es: " + calculoRadio);
	}
}
