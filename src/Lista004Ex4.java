import java.util.Scanner;

//Escreva, usando while, um programa para calcular a média de N números. O valor de N é dado pelo usuário

public class Lista004Ex4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Criando as Variáveis

        int contador = 1;
        double qtdDeNumeros;
        double numerosUsuario = 0;
        double soma = 0;
        double media = 0;

        System.out.println(" Digite a quantidade de números que serão somados :");
        qtdDeNumeros = leitor.nextDouble();

        // Iniciando o contador

        while (contador <= qtdDeNumeros) {

            System.out.println(" Digite o número " + contador + ":");
            numerosUsuario = leitor.nextDouble();

            // Somando os números dados pelo usuário

            soma = soma + numerosUsuario;

            // Calculando a média dos números dados pelo usuário

            media = (soma / qtdDeNumeros);
            contador++;

        }

        System.out.println("A média dos números digitados é : " + media);

    }
}
