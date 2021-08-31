/* Faça um programa para ler uma quantidade de números (N) digitada pelo
usuário e mostrar a quantidade de números pares e a quantidade de números
ímpares desses números. */

import java.util.Scanner;

public class Lista005Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Escrevendo as variáveis
        int contador = 1;
        double numerosDigitados;
        double qtdDeNumerosDigitados;
        double qtdDeNumerosPares = 0;
        double qtdDeNumerosImpares = 0;

        //Perguntando ao usuário a quantidade de números desejados
        System.out.println(" Quantos números deseja digitar?");
        qtdDeNumerosDigitados = leitor.nextDouble();

        //Iniciando o contador
        while (contador <= qtdDeNumerosDigitados) {

            System.out.println("Digite o numero " + contador + ":");
            numerosDigitados = leitor.nextDouble();

            if (numerosDigitados % 2 == 0) {

                qtdDeNumerosPares = qtdDeNumerosPares + 1;

            } else qtdDeNumerosImpares = qtdDeNumerosImpares + 1;

            contador++;
        }
            System.out.println("A quantidade de números pares é : " + qtdDeNumerosPares);
            System.out.println("A quantidade de números ímpares é : " + qtdDeNumerosImpares);
    }
}
