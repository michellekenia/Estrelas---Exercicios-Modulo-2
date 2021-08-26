package br.com.zup;

import java.util.Scanner;

public class ExemploLista002 {
    public static void main(String[] args) {

        //Instanciando o Scanner
        Scanner leitor = new Scanner (System.in);

        //Declarando as variavéis
        System.out.println("Por favor, digite o número 1: ");
        double numeroUm = leitor.nextDouble();

        System.out.println("Por favor, digite o número 2: ");
        double numeroDois = leitor.nextDouble();

        // Verificando se o número 2 é maior que o número 1
        if (numeroUm < numeroDois) {
            System.out.println("O número 2 é maior");
        }

        //Verificando se os números são iguais
        else if (numeroUm == numeroDois) {
            System.out.println("Os números são iguais");
        }

        //Se o número 2 não for maior que o número 1 e eles não forem iguais
        else {
            System.out.println("O número 1 é o maior");
        }
    }
}
