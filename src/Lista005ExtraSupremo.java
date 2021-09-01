/*
Faça um programa que receba um conjunto de N números (Digitado pelo usuário) e
mostre:
a. O menor valor
b. O maior valor
c. A soma dos valores.
 */

import java.util.Scanner;

public class Lista005ExtraSupremo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Escrevendo as variáveis
        int contador = 1;
        double qtdDeNumeros;
        double valorDigitado;
        double menorValor = 0;
        double maiorValor = 0;
        double somaDosValores = 0;

        //Perguntando ao usuário a quantidade de números
        System.out.println(" Digite a quantidade de números : ");
        qtdDeNumeros = leitor.nextDouble();

        //Iniciando o contador
        while (contador <= qtdDeNumeros) {
            System.out.println(" Digite o número " + contador + ":");
            valorDigitado = leitor.nextDouble();

            //Dando as condições
            if (contador == 1) {
                menorValor = valorDigitado;
                maiorValor = valorDigitado;

            } else {
                    if (valorDigitado <= menorValor) {
                        menorValor = valorDigitado;
                    }
                    if (valorDigitado >= maiorValor) {
                        maiorValor = valorDigitado;
                    }
                }

            somaDosValores = somaDosValores + valorDigitado;
            contador++;
        }

        System.out.println("O menor valor digitado é : " + menorValor);
        System.out.println("O maior valor digitado é : " + maiorValor);
        System.out.println("A soma dos números digitados é : " + somaDosValores);

    }

}

