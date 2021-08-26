package br.com.zup;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lista001Ex2Scanner {
    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner leitor = new Scanner (System.in);

        // Declarar o valor das variáveis
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float soma;
        float media;

        // Receber o valor das variáveis
        System.out.println("Vamos calcular a média das suas notas: ");
        System.out.println("Por favor, digite a nota 1");
        nota1 = leitor.nextFloat();
        System.out.println("Por favor, digite a nota 2");
        nota2 = leitor.nextFloat();
        System.out.println("Por favor, digite a nota 3");
        nota3 = leitor.nextFloat();
        System.out.println("Por favor, digite a nota 4");
        nota4 = leitor.nextFloat();

        // Processar os dados
        soma = nota1 + nota2 + nota3 + nota4;
        media = soma/4;

        // Exibir os dados
        System.out.println("Sua média aritmética é: ");
        System.out.println(media);
    }
}