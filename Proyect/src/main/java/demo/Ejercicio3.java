package demo;

import javax.swing.JOptionPane;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		/*String nombre = "Jazmin";
		System.out.println("Bienvenida " +nombre);*/
		
	//Ejercicio 4
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
		
		JOptionPane.showMessageDialog(null, "Bienvenida " +nombre);
	}

}
