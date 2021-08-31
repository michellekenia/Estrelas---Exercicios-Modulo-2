
/*Faça um programa para ler uma quantidade de números (N) digitada pelo
usuário e mostrar a quantidade de números ímpares desses números. */

import java.util.Scanner;

public class Lista005Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Criando as variáveis
        int contador = 1;
        double qtdDeNumerosDigitados;
        double numerosDigitados;
        double numerosPares = 0;
        double numerosImpares = 0;

        //Perguntando ao usuário a quantidade de números
        System.out.println(" Quantos números deseja digitar ? ");
        qtdDeNumerosDigitados = leitor.nextDouble();

        //Iniciando o contador
        while (contador <= qtdDeNumerosDigitados) {
            System.out.println(" Digite o número " + contador + ":" );
            numerosDigitados = leitor.nextDouble();

            if (numerosDigitados % 2 == 0) {
                numerosPares = numerosPares + 1;
            }

            else { numerosImpares = numerosImpares + 1;

            }
            contador ++;
        }

        System.out.println(" A quantidade de números ímpares é : " + numerosImpares);
    }
}
