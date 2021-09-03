package ExerciciosLista006;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Se numeroPrimo = 0, então não é primo. Se for igual a 1 é primo.
        // A variável numeroPrimo é um código. Uma marcação p/ verdadeiro ou falso. Poderia ser qualquer 2 números.
        int numeroPrimo = 1;

        System.out.println("Digite um número para descobrir se é um número primo ou não: ");
        int numeroDigitado = Math.abs(leitor.nextInt());

        if (numeroDigitado <= 1) {
            System.out.println("Não é número primo.");
        }
        else if (numeroDigitado <= 3) {
            System.out.println("É um número primo.");
        }

        else {

            for (int divisor = 3; divisor < numeroDigitado; divisor++) {

                if (numeroDigitado % divisor == 0) {
                    numeroPrimo = 0;
                }
            }

            if (numeroPrimo == 1) {
                System.out.println("É um número primo.");
            }
            else {
                System.out.println("Não é um número primo.");
            }

        }


    }

}

