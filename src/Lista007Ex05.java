
/* Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente-o
de 1000 em 1000, imprimindo seu valor na tela, até que seu valor seja 100000 (cem
mil). */

public class Lista007Ex05 {
    public static void main(String[] args) {

        //Variáveis
        int contador = 0;

        //Iniciando o contador:
        while (contador <= 100000) {
            System.out.println(contador);
            contador = contador + 1000;

        }
    }
}
