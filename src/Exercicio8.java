/*Faça um Programa que leia uma lista de 5 números inteiros e mostre-os.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Insira o número " + i + ": ");
            numeros.add(leitor.nextInt());
        }

        System.out.println("Esta é a lista: " + numeros);

    }
}
