package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ListaAula02 {  //ordena��o
	
	public static void main(String[] args) {
		
	List<Jogador> jogadores = new ArrayList<Jogador>() {
		private static final long serialVersionUID = 1L;

	{
		add(new Jogador("Igor Rabelo", 4, "Atl�tico-MG") );
		add(new Jogador("Oyama", 55, "Botafogo") );
		add(new Jogador("Gatito", 1, "Botafogo") );
		add(new Jogador("Navarro", 9, "Palmeiras") );
		add(new Jogador("Cuesta", 15, "Botafogo") );
		add(new Jogador("Chay", 14, "Botafogo") );
		add(new Jogador("Hulk", 7, "Atl�tico-MG") );
		add(new Jogador("Igor Alfredo", 10, "Atl�tico-MG") );
		
	}};
			
	System.out.println("---\tOrdem de inser��o\t---");
	System.out.println(jogadores);
	
	System.out.println("---\tOrdem aleat�ria\t---");
	Collections.shuffle(jogadores);
	System.out.println(jogadores);
	
	System.out.println("---\tOrdem por time\t---");
	Collections.sort(jogadores); // m�todo de ordena��o A
	System.out.println(jogadores);
	
	System.out.println("---\tOrdem por n�mero\t---");
	jogadores.sort( new ComparatorNumero() );  // m�todo de ordena��o B
	System.out.println(jogadores);

	
	System.out.println("---\tOrdem por nome\t---");
	jogadores.sort( new ComparatorNome() );
	System.out.println(jogadores);

	
	System.out.println("---\tOrdem por time/numero/nome\t---"); 
	jogadores.sort( new ComparatorTimeNumeroNome() );
	System.out.println(jogadores);

}}

// comparando por n�mero (aqui seria outro arquivo!)
class ComparatorNumero implements Comparator<Jogador> {
	public int compare(Jogador jog1, Jogador jog2) {
		return Integer.compare(jog1.getNumero(), jog2.getNumero());
	}
}

// comparando por nome (aqui seria outro arquivo!)
class ComparatorNome implements Comparator<Jogador> {
	public int compare(Jogador jog1, Jogador jog2) {
		return jog1.getNome().compareTo(jog2.getNome());
	}
}
//comparando por nome (aqui seria outro arquivo!)
class ComparatorTimeNumeroNome implements Comparator<Jogador> {
	public int compare(Jogador jog1, Jogador jog2) {
		int time = jog1.getTime().compareToIgnoreCase(jog2.getTime());
		if (time != 0) return time;
		
		int numero = Integer.compare(jog1.getNumero(), jog2.getNumero());
		if (numero!=0) return numero;
		
		return  jog1.getNome().compareToIgnoreCase(jog2.getNome());	
	}
}


