package demo;

import javax.swing.JOptionPane;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		String radio = JOptionPane.showInputDialog("Ingrese el radio: ");
		double r = Double.parseDouble(radio);
		
		double area  = Math.PI * Math.pow(r, 2);
		
		JOptionPane.showMessageDialog(null, "El area es: " +area);
	}

}
