/*
Faça um Programa que leia uma lista de 5 números inteiros, mostre a soma,
a multiplicação e os números.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Integer> numerosInteiros = new ArrayList<>();

        for (int numero = 1; numero <= 5; numero++) {
            System.out.print("Digite o número " + numero + ":");
            numerosInteiros.add(leitor.nextInt());
        }


        int soma = numerosInteiros.get(0) + numerosInteiros.get(1) + numerosInteiros.get(2)
                + numerosInteiros.get(3) + numerosInteiros.get(4);

        int multiplicação = numerosInteiros.get(0) * numerosInteiros.get(1) * numerosInteiros.get(2)
                * numerosInteiros.get(3) * numerosInteiros.get(4);

        System.out.println("Lista de números: " + numerosInteiros);
        System.out.println("Soma dos números: " + soma);
        System.out.println("Multiplicação dos números: " + multiplicação);

    }
}
