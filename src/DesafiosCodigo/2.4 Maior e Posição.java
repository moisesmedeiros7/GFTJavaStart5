/*
Desafio
Você recebeu o desafio de ler 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
2                       34565
113                     4
45
34565
6
...
8

*/

// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.*;

 class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
//TODO: Complete os espaços em branco com uma possível solução para o desafio
    List<Integer> numeros = new ArrayList<>();
    for(int i = 0; i < 100; i++){
      int numero = scan.nextInt();
      numeros.add(                    );
    }

    Integer max = Collections.max(                    );
    System.out.println(           );
    int position = numeros.indexOf(               ) +1;
    System.out.println(           );
  }
}