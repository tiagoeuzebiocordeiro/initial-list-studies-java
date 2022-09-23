package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		// Instaciação de Lista, não aceita tipos primitivos, só wrapper classes!
		List<String> list = new ArrayList<>();
		// Classe Array List - otimizada para implementar a Interface List

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Tiago"); // Adiciona a String "Tiago" na posição 2 (dois)

		System.out.println("Tamanho da lista = " + list.size());
		for (String s : list) {
			System.out.println(s);

		}
		System.out.println("-----------------------------");
		System.out.println("Vamos remover a Ana da lista...");
		list.remove("Anna");
		System.out.println("-----------------");
		for (String s : list) {
			System.out.println(s);

		}
		System.out.println("---------------");
		System.out.println("Agora vamos remover a posição dois da lista...");
		System.out.println("---------------");
		list.remove(2);
		for (String s : list) {
			System.out.println(s);

		}
		System.out.println("--------------------------");
		System.out.println("Vamos remover algum nome que tenha M como inicial!");
		System.out.println("--------------------------");

		/*
		 * Predicado, lê-se: pegue um valor s(tipo string) e me retorne se o valor da
		 * String S é igual a M no primeiro char da string(0)
		 */
		list.removeIf(s -> s.charAt(0) == 'M');
		for (String s : list) {
			System.out.println(s);

		}
		
		System.out.println("Posição de Bob: " + list.indexOf("Bob"));
		/*Caso você procure por um elemento que não consta na lista, o console vai 
		 * imprimir/retornar o valor de -1*/
		System.out.println("-------------------------------------");
		System.out.println("Deixando na lista apenas pessoas que tenham o nome com inicial [A]");
		
		List<String> result = list.stream().filter(s -> s.charAt(0) == 'A').collect(Collectors.toList());
		for (String s : result) {
			System.out.println(s);

		}
		System.out.println("-------------------------------");
		System.out.println("Achando o primeiro elemento com inicial A");
		String name = list.stream().filter(s -> s.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
		
	}

}
