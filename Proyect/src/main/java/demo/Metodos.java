package demo;

public class Metodos {
	int n1,n2;
	
	public Metodos(int n1, int n2) {
		this.n1=n1;
		this.n2= n2;
	}
	
	public Metodos() {
		
	}
		//declaramos un constructor
	//public Metodos(int numero) {
		//System.out.println(numero);
	//}
	/*public static void main(String[] args) {
		Metodos nombreObjeto = new Metodos();
		Metodos nombreObjeto2 = new Metodos(9,3);
		
		System.out.println(nombreObjeto2.sumatoria());
		System.out.println(nombreObjeto.sumatoria());
		
		nombreObjeto.MostrarMensaje();
		String elementoGuardado = nombreObjeto.mostrarNombre("Jazmin");
		System.out.println(elementoGuardado);
		
		Metodos.prueba();
	}*/
	
	public void MostrarMensaje() {
		System.out.println("Hola Mundo");
	}
	
	public int sumatoria () {
		return n1+n2;
	}
	
	public String mostrarNombre(String nombre){
		System.out.println(nombre);
		return nombre;
	}
	/*private static void pruebas() {
		System.out.println("Metodo estatico");
		

	}*/

}
