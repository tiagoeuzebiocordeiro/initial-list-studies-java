package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		/* Estudando Listas */
		
		
		List<String> list = new ArrayList<>(); // List<tipo-lista> [Não aceita tipos primitivos, só wrapper class]
		list.add("Tiago");  // Adicionando a String "Tiago" na lista
		list.add(0, "Bruno"); // Adicionando a String "Bruno" na pos. 0 [primeira posição]
		list.add("Marcelo"); // Adicionando a String marcelo na lista.
		
		System.out.println("LISTA:");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("Tamanho da lista = " + list.size());
		System.out.println("Index of Marcelo = " + list.indexOf("Marcelo"));
		System.out.println("LIST="+list);
		System.out.println("POS[2]= " + list.get(2));
		
		System.out.print("Digite o nome que irá ser acrescentado na lista: ");
		String nome = sc.nextLine();
		System.out.print("Qual posição quer que ele esteja? ");
		int pos = sc.nextInt();
				
		list.add(pos, nome);
		System.out.println("Updated list:");
		System.out.println(list);
		System.out.println("Tamanho: " + list.size());
		System.out.print("Deseja fazer outra lista e apagar a atual? [1] p/ sim e [2] p/ nao: ");
		int resp = sc.nextInt();
		
		if (resp == 2) {
			System.out.println("OK.");
		} else {
			list.clear();
			System.out.print("Quantos nomes serão acrescentados na lista? ");
			int quant = sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < quant; i++) {
				System.out.print("Digite um nome: ");
				nome = sc.nextLine();
				list.add(nome);
			}
		}
		
		System.out.println("NOVA LISTA:");
		System.out.println(list);
		sc.nextLine();
		System.out.print("Digite uma pessoa para ser removida da lista: ");
		String remove = sc.nextLine();
		list.remove(remove);
		System.out.println("LIST="+list);
		
		
		/*
		 * Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
		 * */
		
		list.removeIf(s -> s.charAt(0) == 'M'); // Para cada String s na lista list, que tenha o nome começado com "M", remova da lista
		System.out.println("LIST: "+list);
		List<String> result = list.stream().filter(s -> s.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println("imprimindo somente quem comeca com A");
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("encontrando elemento com base no predicado B:");
		String k = list.stream().filter(s -> s.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(k);
		
		sc.close();
	}

}
