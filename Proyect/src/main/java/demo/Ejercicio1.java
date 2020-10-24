package demo;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio1 {
//ejercicio de suma
	public static void main(String[] args) {
		
		String dato1 =JOptionPane.showInputDialog("Ingrese numero1:");
		int n1=Integer.parseInt(dato1);
		
		String dato2 =JOptionPane.showInputDialog("Ingrese numero2:");
		int n2=Integer.parseInt(dato2);
		
		JOptionPane.showMessageDialog(null, "Suma:"+ (n1+n2));
		JOptionPane.showMessageDialog(null, "Resta:"+ (n1-n2));
		JOptionPane.showMessageDialog(null, "Multiplicación:"+ (n1*n2));
		JOptionPane.showMessageDialog(null, "Divion:"+ (n1/n2));
		JOptionPane.showMessageDialog(null, "Modulo:"+ (n1%n2));
		/*System.out.println("ingrese un número");
		Scanner entrada = new Scanner(System.in);
		int n1=entrada.nextInt();
		
		
		System.out.println("ingrese un número");
		Scanner entrada2 = new Scanner(System.in);
		int n2=entrada2.nextInt();
		
		System.out.println("Suma:"+ (n1+n2));
		System.out.println("Resta:"+ (n1-n2));
		System.out.println("Multiplicación:"+ (n1*n2));
		System.out.println("División:"+ (n1/n2));*/
	}
}
