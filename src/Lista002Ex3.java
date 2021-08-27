import java.util.Scanner;

public class Lista002Ex3 {
    public static void main(String[] args) {

        //Instanciando o Scanner
        Scanner leitor = new Scanner(System.in);

        // Calcular a média de 2 notas

        System.out.println("Por favor, insira a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Por favor, insira a segunda nota: ");
        double nota2 = leitor.nextDouble();

        double mediaDasNotas = (nota1 + nota2)/2;

        // Condição de aprovado, reprovado ou aprovado com distinção

        if (mediaDasNotas >= 7 & mediaDasNotas <10) {
            System.out.println("Parabéns, você foi aprovado.");
        }
        else if (mediaDasNotas == 10){
            System.out.println("Parabéns, você foi aprovado com distinção!");
        }

        else {
            System.out.println("Infelizmente você não foi aprovado. Mas não se preocupe, você poderá fazer a recuperação.");
        }
    }
}




