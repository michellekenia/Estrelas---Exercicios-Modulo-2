/*
João Papo-de-Pescador, homem de bem, comprou um microcomputador para
controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de
peixes maior que o estabelecido pelo regulamento de pesca do estado de São
Paulo (50 quilos) deve pagar uma multa de R$4,00 por quilo excedente. João
precisa que você faça um programa que leia a variável peso (peso de peixes) e
calcule o excesso. Gravar na variável excesso a quantidade de quilos além do
limite e na variável multa o valor da multa que João deverá pagar. Imprima os
dados do programa com as mensagens adequadas.
 */

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Variáveis
        double pesoDosPeixes;
        double pesoMaximo = 50;
        double excessoDePeso = 0;
        double valorAPagar = 0;
        double multa = 4.00;

        //Pedindo ao usuário o peso em kg dos peixes
        System.out.println("Digite o peso dos peixes em Kg: ");
        pesoDosPeixes = leitor.nextDouble();

        //Calculando o excesso

        if (pesoDosPeixes >= pesoMaximo) {
            excessoDePeso = pesoDosPeixes - pesoMaximo;
            valorAPagar = excessoDePeso * multa;

            System.out.println("O peso excede em " + excessoDePeso + " Kg" + " o limite estipulado pelo Estado de São Paulo.");

            System.out.println("Você deve pagar " + valorAPagar + " de multa. Sendo a multa 4,00 por Kg excedente.");

        } else if (pesoDosPeixes <= 0) {
            System.out.println("Digite um valor maior do que zero.");
            return;
        } else {
            System.out.println("O peso está dentro do limite (50 Kg) permitido pelo Estado de São Paulo. Não haverá multa.");
        }

    }
}
