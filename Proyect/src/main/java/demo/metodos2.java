package demo;

import java.util.ArrayList;
import java.util.List;

public class metodos2 {
	static String heredar = "Mensaje de Texto";
	
	public static List<String> ListaDeNombres(){
		List<String> ListaNombres = new ArrayList<>();
		ListaNombres.add("Jazmin");
		ListaNombres.add("Cristina");
		ListaNombres.add("Moreno");
		ListaNombres.add("Pareja");
		
		return ListaNombres;
	}
	
	public static List<String> ListaDeNombres2(){
		List<String> ListaNombres = new ArrayList<>();
		ListaNombres.add("Jazmin");
		ListaNombres.add("Cristina");
		ListaNombres.add("Moreno");
		ListaNombres.add("Pareja");
		
		return ListaNombres;
	}
	public static List<Integer> listaNumeros(){
		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(1);
		listaNumeros.add(20);
		listaNumeros.add(6);
		listaNumeros.add(78);
		listaNumeros.add(12);
		
		return listaNumeros;
	}

}
