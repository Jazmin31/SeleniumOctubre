package demo;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MainMetodos extends metodos2 {
	
	public static void main(String[] args) {
		Metodos nombreObjeto = new Metodos();
		Metodos nombreObjeto2 = new Metodos(9,3);
		metodos2 objeto = new metodos2();
		
		System.out.println(nombreObjeto2.sumatoria());
		System.out.println(nombreObjeto.sumatoria());
		System.out.println(heredar);
		
		nombreObjeto.MostrarMensaje();
		String elementoGuardado = nombreObjeto.mostrarNombre("Jazmin");
		System.out.println(elementoGuardado);
		
		//Metodos.pruebas();
		
		List<String> listaNombres = ListaDeNombres();
		List<Integer> listaNumeros = listaNumeros();
		
		for(String nombre : listaNombres) {
			System.out.println(nombre);
			
		}
		System.out.println("for con dos puntos");
		//es igual al for de arribita
		for(int indice=0; indice<listaNombres.size(); indice++) {
			System.out.println(listaNombres.get(indice));
			
		}
		System.out.println("for con index");
		
		for (int numero : listaNumeros) {
			System.out.println(numero);
		}
		
		
		List<String> nombresSinElementosDuplicados = listaNombres
				.stream()
				.distinct()
				.collect(Collectors.toList());
		Collections.sort(nombresSinElementosDuplicados);
		System.out.println(nombresSinElementosDuplicados);
		Collections.sort(nombresSinElementosDuplicados, Collections.reverseOrder());
		System.out.println(nombresSinElementosDuplicados);
		
		System.out.println(Collections.max(listaNumeros));
		System.out.println(Collections.min(listaNumeros));
		Collections.sort(listaNumeros);
		System.out.println(listaNumeros);
		Collections.sort(listaNumeros, Collections.reverseOrder());
		System.out.println(listaNumeros);
		
		//sort ordena de mayor a menor
		//creamos un objeto para guardar temporalmente el resultado de las interacciones
		Object last = null;
		int numCount = 0;
		Iterator<Integer> i = listaNumeros.iterator();
		//ciclo para quitar repetidos
		while (i.hasNext()) {
			Object temp = i.next();
			if(temp.equals(last)) {
				i.remove();
				numCount++;
			}else {
				last=temp;
			}
		}
		System.out.println(numCount);
		System.out.println(listaNumeros);
		//inicializamos listas
		List<String> Nombres1 = ListaDeNombres();
		List<String> Nombres2 = ListaDeNombres2();
		//primero ordenamos la lista
		Collections.sort(Nombres1);
		Collections.sort(Nombres2);
		
		boolean isIgual = Nombres1.equals(Nombres2);
		System.out.println(isIgual);
		
		if(isIgual==true) {
			System.out.println("Las listas son iguales: " + Nombres1+" "+" Lista2: "+Nombres2+" ");
		}else {
			System.out.println("Las listas no son iguales:\n");
			System.out.println("Lista1: "+ Nombres1+" "+ "Lista2: "+Nombres2+" ");
		}
		
	}

}
