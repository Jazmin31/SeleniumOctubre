package demo;

public class Carro {
	static int numero;
	
	public static void main(String[] args) {
		numero=2;
		int numero2=3;
		boolean verdaderoOfalso;
		double numeroConPuntoDecimal;
		
		System.out.println(numero+numero2);
		
		String cadeDeCaracteres;
		cadeDeCaracteres="Jazmin Cristina";
		System.out.println(cadeDeCaracteres+" Curso Selenium");
		
	
		verdaderoOfalso=cadeDeCaracteres.equals("Jazmin Cristina");
		System.out.println(verdaderoOfalso);
		
		if(verdaderoOfalso=true) {
			System.out.println("el nombre es igual");
		}else {
			System.out.println("el nombre es diferente");
		}
		
		int n1=2,n2=5;
		System.out.println(n1+n2);
		
	
		
	}
	
	/*public static void test(String[] args) {
		
		numero=1;
	}*/
		

}
