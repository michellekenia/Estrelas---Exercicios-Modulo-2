/* Escreva um programa que declare um inteiro, inicialize-o com 10, e incremente-o
de 200 em 200, imprimindo seu valor na tela, até que seu valor seja 200000 (cem
mil). */

public class ExemploRepeticao {
    public static void main(String[] args) {

        System.out.println("Números de 200 em 200 até 200000");

        int contador = 0;

        while (contador <= 10000) {
            System.out.println(contador);

            contador = contador + 100;
        }


    }


}
