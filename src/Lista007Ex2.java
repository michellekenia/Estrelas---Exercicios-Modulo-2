

/*Faça um programa que leia números inteiros e imprima sua média */

import java.util.Scanner;

public class Lista007Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Variáveis
        int contador = 1;
        int qtdDeNumeros;
        int numerosUsuario;
        double somaNumerosDigitados = 0;
        double mediaDosNumerosDigitados = 0;

        //Pedindo a quantidade de números
        System.out.println("De quantos números deseja tirar a média? ");
        qtdDeNumeros = leitor.nextInt();

        //Iniciando o contador
        while (contador <= qtdDeNumeros) {
            System.out.println("Digite o número: " + contador + ":");
            numerosUsuario = leitor.nextInt();

            somaNumerosDigitados = somaNumerosDigitados + numerosUsuario;

            mediaDosNumerosDigitados = somaNumerosDigitados/qtdDeNumeros;

            contador++;

        }

        System.out.println("Soma dos números digitados :" + somaNumerosDigitados);
        System.out.println("Media dos números digitados :" + mediaDosNumerosDigitados);



    }
}
