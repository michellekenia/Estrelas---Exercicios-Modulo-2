/* Escreva um programa que leia 10 números e escreva o menor valor lido e o maior
valor lido.*/

import java.util.Scanner;

public class Lista007Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Variáveis
        int contador = 1;
        double numeroDigitado;
        double menorValor = 0;
        double maiorValor = 0;

        //Iniciando o contador
        while (contador <= 10) {
            System.out.println("Digite o número " +contador+ ":");
            numeroDigitado = leitor.nextDouble();

            //Condições

            if (contador==1) {
                menorValor = numeroDigitado;
                maiorValor = numeroDigitado;

            } else {

                if (numeroDigitado <= menorValor) {
                    menorValor = numeroDigitado;
                }
                if (numeroDigitado >= maiorValor) {
                    maiorValor = numeroDigitado;
                }

            }

            contador++;
        }

        //Printar os resultados
        System.out.println("O menor valor digitado é: " + menorValor);
        System.out.println("O maior valor digitado é: " + maiorValor);

    }
}
