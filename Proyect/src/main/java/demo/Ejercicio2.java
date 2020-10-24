package demo;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	
	
	public static void main(String[] args) {
		String dato1 = JOptionPane.showInputDialog("Ingresar numero:");
		int n1=Integer.parseInt(dato1);
		
		String dato2 = JOptionPane.showInputDialog("Ingrese numero2:");
		int n2 = Integer.parseInt(dato2);
		
		if (n1>n2) {
			JOptionPane.showMessageDialog(null, "El numero mayor es: " + n1);
		}else if(n1==n2) {
			JOptionPane.showMessageDialog(null, "los numeros son iguales");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "El número mayor es: " +n2);
		}
	}

}
