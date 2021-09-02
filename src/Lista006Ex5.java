/* Faça um programa que leia 5 números e informe o maior número. */

import java.util.Scanner;

public class Lista006Ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Variáveis
        int contador = 1;
        double valorDigitado;
        double maiorValor = 0;

        while (contador <= 5) {
            System.out.println("Digite o número " + contador + ":");
            valorDigitado = leitor.nextDouble();

            if (contador == 1) {
                valorDigitado = maiorValor;

            } else if (valorDigitado >= maiorValor) {
                maiorValor = valorDigitado;

            }

            contador++;
        }

        System.out.println("O maior valor é: " + maiorValor);
    }

}
