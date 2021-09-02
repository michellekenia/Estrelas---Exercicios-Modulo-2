/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver
a tabuada */

import java.util.Scanner;

public class Lista006Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 1;
        int numeroMaximo = 10;
        int numeroDigitado = 0;
        int multiplicador = 0;

        System.out.println("Digite o número que deseja saber a tabuada: ");

        while (contador <= numeroMaximo) {
            numeroDigitado = leitor.nextInt();

            System.out.println("Tabuada do " + numeroDigitado + ":");

            while (contador <= numeroMaximo) {
                multiplicador = numeroDigitado * contador;

                System.out.println(numeroDigitado + " x " + contador + " = " + multiplicador);

                contador++;
            }

            contador++;

        }


    }
}