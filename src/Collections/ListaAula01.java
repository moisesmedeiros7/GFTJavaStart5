package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ListaAula01 {
	public static void main(String[] args) {
// AULA01
	List<Double> notas = new ArrayList<Double>();
	
	notas.add(8.0); // mandando inserir
	notas.add(7.0); //colocando inserir na primeira posição
	notas.add( 8.5);
	notas.add(6.5);
	notas.add(9.5);
	notas.add(10.0);
	System.out.println("1. Notas: "+notas);
	
	System.out.println("2. Nota 10.0 na posição: "+notas.indexOf(10.0));
	
	System.out.println("3. Adicione a lista a nota 8.0 na posição 4.");	
	notas.add(4, 8.0);	// inserindo valor na posição
	System.out.println(notas);
	
	System.out.println("4. Substitua a nota 10.0 por 9.9.");
	notas.set(notas.indexOf(10.0), 9.9);
	System.out.println(notas);

	System.out.println("5. Confira se a nota 6.5 está na lista: "+ notas.contains(6.5));
	
	System.out.println("6. Exiba todas as notas na ordem em que foram informadas: "+notas);
    //	for (Double nota : notas) System.out.println(nota); //exemplo com foreach
	
	System.out.println("7. Exiba terceira nota informada: "+ notas.get(2));
	
	System.out.println("8. Exiba a menor nota informada: "+ Collections.min(notas));

	System.out.println("9. Exiba a maior nota informada: "+ Collections.max(notas));
	
	// soma das notas
	Iterator<Double>iterator = notas.iterator();
	Double soma = 0.0;
	
	while(iterator.hasNext()) { // Existe próximo elemento?
		Double next = iterator.next();   // Passe o elemento
		soma += next;  // Vá somando o valor 
	}
	System.out.println("10. Exiba a soma das notas: "+ soma);
	
	System.out.println("11. Exiba a média das notas: "+ soma/notas.size());
	
	System.out.println("12. Remova a nota 8.5");
	notas.remove(8.5);
	System.out.println(notas);

	System.out.println("13. Remova a nota na posição 1"); 
	notas.remove(1);
	System.out.println(notas);
	
	// removendo notas menores que 7.0
	Iterator<Double>iterator2 = notas.iterator();
	while(iterator2.hasNext()) { // Existe próximo elemento?
		Double next = iterator2.next();   // Passe o elemento
		if(next < 7.0)
		iterator2.remove();
		
	}
	System.out.println("14. Remova as notas menores que 7.0: "+ notas);
	
	System.out.println("15. Apague toda a lista de notas. ");
	notas.clear();
	System.out.println(notas);
	
	System.out.println("16. A lista de notas está mesmo vazia? "+ notas.isEmpty());
	
}}
