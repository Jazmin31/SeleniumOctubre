package demo;

import javax.swing.JOptionPane;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		String numero = JOptionPane.showInputDialog("Ingresarr numero: ");
		int n =  Integer.parseInt(numero);
		
				
		if (n %2 == 0) {
			JOptionPane.showMessageDialog(null, "El numero " +n +" es divisible entre 2");
		} else {
			JOptionPane.showMessageDialog(null, "El numero " +n +" no es divisible entre 2");
		}
	}

}
