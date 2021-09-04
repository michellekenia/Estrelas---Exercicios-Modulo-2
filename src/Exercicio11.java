/*
Faça um Programa que leia 20 números e armazene-os numa lista. Armazene
os números pares na lista PAR e os números ÍMPARES na lista ímpar. Imprima as
três listas.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        //Instanciando o Scanner e criando as listas de números totais, pares e ímpares.

        Scanner leitor = new Scanner(System.in);
        List<Integer> todosOsNumeros = new ArrayList<>();
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        //Usando o for para criar uma repetição dos núemeros gerados pelo usuário.
        //Nesse caso das listas, o leitor.next vai dentro da adição da lista, como se estivesse adicionando
        //um item na lista, mas no caso o usuário vai add vários itens na lista.

        for (int numero = 1; numero <= 20; numero++) {
            System.out.print("Insira o número " + numero + ": ");
            todosOsNumeros.add(leitor.nextInt());
        }

        //Usando o for each para percorrer a lista e diferenciar os números pares dos números ímpares
        //utilizando o if e else para dar as condições necessárias.

        for (Integer tipoDenumero : todosOsNumeros) {

            if (tipoDenumero % 2 == 0) {
                numerosPares.add(tipoDenumero);
            } else {
                numerosImpares.add(tipoDenumero);
            }
        }

        //Imprimindo as listas.

        System.out.println("Essa é a lista de todos os números: " + todosOsNumeros);
        System.out.println("Essa é a lista de números pares: " + numerosPares);
        System.out.println("Essa é a lista de números ímpares: " + numerosImpares);


    }

}
