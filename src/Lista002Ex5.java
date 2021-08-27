import java.util.Scanner;

public class Lista002Ex5 {
    public static void main(String[] args) {

        //Instanciar o Scanner

        Scanner leitor = new Scanner(System.in);

        // Mensagem para o usuário

        System.out.println("Olá! Digite um número de 1 a 7 para saber o dia da semana correspondente. ");
        int diaDaSemana = leitor.nextInt();

        //Declarando Variáveis

        int domingo = 1;
        int segundaFeira = 2;
        int terçaFeira = 3;
        int quartaFeira = 4;
        int quintaFeira = 5;
        int sextafeira = 6;
        int sabado = 7;

        // Declarando a condição

        if (diaDaSemana == domingo) {
            System.out.println("O dia da semana é domingo. ");
        }
        else if (diaDaSemana == segundaFeira){
            System.out.println("O dia da semana é segunda feira. ");
        }
        else if (diaDaSemana == terçaFeira){
            System.out.println("O dia da semana é terça feira. ");
        }
        else if (diaDaSemana == quartaFeira){
            System.out.println("O dia da semana é quarta feira. ");
        }
        else if (diaDaSemana == quintaFeira){
            System.out.println("O dia da semana é quinta feira. ");
        }
        else if (diaDaSemana == sextafeira){
            System.out.println("O dia da semana é sexta feira. ");
        }
        else if (diaDaSemana == sabado){
            System.out.println("O dia da semana é sábado. ");
        }

        else {
            System.out.println("Por favor, digite um número de 1 a 7.");
        }

    }
}

