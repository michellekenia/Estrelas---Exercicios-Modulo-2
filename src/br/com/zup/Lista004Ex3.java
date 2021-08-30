package br.com.zup;

import java.util.Scanner;

// Faça um programa para ler 5 números e mostrar o resultado da soma desses números.

public class Lista004Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Criando variáveis
        int contador = 1;
        int qtdDeRepeticao = 5;
        double numeroUsuario;
        double soma = 0;

       //Iniciando contador

        while (contador <= qtdDeRepeticao) {

            System.out.println ("Digite o número " + contador + ": ");
            numeroUsuario = leitor.nextInt();

            //Somando os números dados pelo usuário

            soma = soma + numeroUsuario;
            contador ++;
        }

        System.out.println("Soma dos números: " + soma);

    }
}
