/* Faça um Programa que leia um número e exiba o dia correspondente da
semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
 */

import java.util.Scanner;

public class Lista006Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Variáveis
        int diaDesejado;
        int domingo = 1;
        int segunda = 2;
        int terça = 3;
        int quarta = 4;
        int quinta = 5;
        int sexta = 6;
        int sabado = 7;


        // Solicitando ao usuário o dia
        System.out.println("Digite o número desejado: ");
        diaDesejado = leitor.nextInt();

        //Condições

        if (diaDesejado == domingo) {
            System.out.println("DOMINGO");

        } else if (diaDesejado == segunda) {
            System.out.println("SEGUNDA FEIRA");

        } else if (diaDesejado == terça) {
            System.out.println("TERÇA FEIRA");

        } else if (diaDesejado == quarta) {
            System.out.println("QUARTA FEIRA");

        } else if (diaDesejado == quinta) {
            System.out.println("QUINTA FEIRA");

        } else if (diaDesejado == sexta) {
            System.out.println("SEXTA FEIRA");

        } else if (diaDesejado == sabado) {
            System.out.println("SÁBADO");

        } else {
            System.out.println("Digite um número válido entre 1 e 7.");
        }
    }
}