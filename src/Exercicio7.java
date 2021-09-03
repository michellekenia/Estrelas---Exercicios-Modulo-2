/*
Faça um programa que receba dois números inteiros e gere os números
inteiros que estão no intervalo compreendido por eles.
 */

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Variáveis

        int primeiroNumero;
        int segundoNumero;

        //Solicitando ao usuário os números do intervalo e dando as condições
        //para que o número não seja <=0.

        System.out.println("Digite o primeiro número do intervalo: ");
        primeiroNumero = leitor.nextInt();

        if (primeiroNumero <= 0) {
            System.out.println("Digite um número maior do que zero.");
            return;
        }

        System.out.println("Digite o segundo número do intervalo: ");
        segundoNumero = leitor.nextInt();

        if (segundoNumero <= 0) {
            System.out.println("Digite um número maior do que zero");
        }

        //Criando o intervalo com o for

        for (int intervalo = primeiroNumero; intervalo <= segundoNumero; intervalo++) {
            System.out.println(intervalo);
        }


    }


}
