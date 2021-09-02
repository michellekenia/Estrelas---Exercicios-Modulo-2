
/* Faça um programa que leia n números inteiros positivos
e calcule a soma desses números. */

import java.util.Scanner;

public class Lista007Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Variáveis
        int contador = 1;
        int qtdDeNumeros;
        int numeroDigitado;
        int somaDosNumerosDigitados = 0;

        //Quantidade de números
        System.out.println("Quantos números deseja digitar?");
        qtdDeNumeros = leitor.nextInt();

        //Iniciando o contador
        while (contador <= qtdDeNumeros) {
            System.out.println("Digite o número " + contador + ":");
            numeroDigitado = leitor.nextInt();

            if (numeroDigitado > 0) {
                somaDosNumerosDigitados = somaDosNumerosDigitados + numeroDigitado;

            } else {
                System.out.println("Digite um número positivo");
            }

            contador++;

        }

        System.out.println("A soma dos números digitados é: " +somaDosNumerosDigitados);


    }
}
