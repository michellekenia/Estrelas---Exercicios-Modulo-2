/* Faça um programa que imprima na tela apenas os números ímpares entre 1 e
50. */


package ExerciciosLista006;

public class Exercicio6 {
    public static void main(String[] args) {

        //Usando o for para números que imprimam do 1 a0 50

        System.out.println("Lista de números ímpares do 1 ao 50: ");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }

    }
}
