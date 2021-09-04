/*
Faça um Programa que leia uma lista de 10 números e mostre-os na ordem
inversa.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int repeticao = 1; repeticao <= 10; repeticao++) {
            System.out.print("Digite o número " + repeticao + ":");
            numeros.add(leitor.nextInt());
        }
        for (int impressao = 9; impressao >= 0; impressao--) {

            if (impressao > 0) {System.out.print(numeros.get(impressao) + ",");

            } else {System.out.print(numeros.get(impressao) + ".");}



        }

    }
}
