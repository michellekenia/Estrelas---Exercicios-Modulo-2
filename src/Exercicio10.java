/*
Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
 */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Variáveis
        int quantidadeDenotas = 4;
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double somaDasNotas;
        double mediaDasNotas;

        //Solicitando as notas ao usuário

        System.out.println("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = leitor.nextDouble();

        System.out.println("Digite a quarta nota: ");
        nota4 = leitor.nextDouble();

        //Soma e média das notas
        somaDasNotas = nota1 + nota2 + nota3 + nota4;
        mediaDasNotas = somaDasNotas/quantidadeDenotas;

        System.out.println("A soma das notas é: " + somaDasNotas);
        System.out.println("A média das notas é: " + mediaDasNotas);





    }
}
