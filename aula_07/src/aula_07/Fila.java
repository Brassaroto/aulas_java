package aula_07;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		// Cria a Estrutura de dados fila
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Calos");
		fila.add("Giovana"); 
		fila.add("Livia"); 
		fila.add("Maria"); 	
		fila.add("Samuel");
		fila.add("Fabrício");
	    fila.add("Victor");
	    
	    System.out.println(fila);
	    
	    fila.remove();
	    
	    System.out.println(fila);
	    
	    fila.add("Thiago");
	    
	    System.out.println(fila);
	    
	    System.out.println(fila.peek());
	    
	    System.out.println(fila.poll());
	    
	    System.out.println(fila);
	    
	    System.out.println("A Maria está na fila? " + fila.contains("Maria"));
	    System.out.println("O Carlos está na fila? " + fila.contains("Carlos"));
	    
	    System.out.println("Qual é o tamanho da fila? " + fila.size());
	    
	    int contador = 0;
	    
	    for (var pessoa : fila) {
	        contador++;
	        if (pessoa.equalsIgnoreCase("Maria")) {
	            System.out.printf("\nA Maria está em %dº lugar na fila.\n", contador);
	        }
	    }
	}
}
