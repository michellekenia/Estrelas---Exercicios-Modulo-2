
/* Faça um programa para ler uma quantidade de números (N) digitada pelo
usuário e mostrar a quantidade de números pares desses números. */

import java.util.Scanner;

public class Lista005Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Criando as variáveis

        int contador = 1;
        double qtdDeNumerosDigitados;
        double numerosDigitados;
        double qtdDeNumerosPares = 0;

        //Pedir ao usuário a quantidade de números

        System.out.println("Quantos números deseja digitar? ");
        qtdDeNumerosDigitados = leitor.nextDouble();

        //Iniciando o contador

        while (contador <= qtdDeNumerosDigitados) {
            System.out.println("Digite o número " + contador + ":");
            numerosDigitados = leitor.nextDouble();

            if (numerosDigitados % 2 == 0) {
                qtdDeNumerosPares = qtdDeNumerosPares + 1;
            }
            contador++;
        }
        System.out.println(" A quantidade de números pares é : " + qtdDeNumerosPares);

    }
}
