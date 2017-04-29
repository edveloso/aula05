package aula05;

import java.util.*;
public class Formulario {

	public static void main(String[] args) {
		
		//Colecoes
		//framework collections
		//Collection              | Map
		//Set, List, Queue
		List<String> lista = new ArrayList<String>();
		lista.add("LOL");
		lista.add("GTA");
		lista.add("Second Life");
		lista.add("Super Mario");
		lista.add("Skyrim");
		lista.add("CS - go");
		
		lista.add(2, "PacMan");
		
		Collections.sort(lista);
		
		
		System.out.println("mostrar um item na posicao 4");
		System.out.println(lista.get(3));
		
		List<String> consoles = new ArrayList<String>();
		consoles.add("Ps4");
		consoles.add("Atari");
		consoles.add("Nintendo DS");
		consoles.add("Mega drive");
		
		
		lista.addAll(consoles);		
		
		//foreach | enhanced for | novo for
		for( String game :  lista ){
			System.out.println(game);
		}
		
		boolean tem = lista.contains("Ps3");
		System.out.println(tem ? "Tem!" : "Num teim!");
		
		System.out.println("a lista tem o comprimento de: " + 
										lista.size() + " itens!");
		
		lista.remove(3);
		System.out.println("Depois da remocao============");
		
		lista.remove(0);
		lista.add(0, "Minecraft");
		
		//foreach | enhanced for | novo for
		for( String game :  lista ){
			System.out.println(game);
		}

		lista.clear();

		System.out.println("O tamanho depois da limpeza: "+ lista.size());
		
		System.out.println(consoles.indexOf("Atari"));
		System.out.println(lista.isEmpty());
		
		lista = new Vector<String>();
		lista = new LinkedList<String>();
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa("Maria"));
		pessoas.add(new Pessoa("Jose"));
		pessoas.add(new Pessoa("Andre"));
		
		Collections.sort(pessoas);
		
		for(  Pessoa ob    : pessoas ){
			System.out.println(ob.getNome());
		}
		
		
		
	}
	
}
