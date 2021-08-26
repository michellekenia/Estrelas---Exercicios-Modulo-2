package br.com.zup;

import java.util.Scanner;

public class Lista002Ex2 {
    public static void main(String[] args) {

        //Instanciando o Scanner

        Scanner leitor = new Scanner(System.in);

        //Declarando as variáveis e mensagens para o leitor

        System.out.println("Por favor, digite o valor do produto 1 : ");
        double produto1 = leitor.nextDouble();

        System.out.println("Por favor, digite o valor do produto 2 : ");
        double produto2 = leitor.nextDouble();

        System.out.println("Por favor, digite o valor do produto 3 : ");
        double produto3 = leitor.nextDouble();

        //Verificando o menor preço

        if (produto1 < produto2 & produto1 < produto3) {
            System.out.println("O produto 1 tem o menor preço");
        }
        else if (produto2 < produto1 & produto2 < produto3  ) {
            System.out.println("O produto 2 tem o menor preço");
        }
        else{
            System.out.println("O produto 3 tem o menor preço");
        }
    }
}
