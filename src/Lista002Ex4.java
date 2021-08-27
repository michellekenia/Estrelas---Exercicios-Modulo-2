import java.util.Scanner;

public class Lista002Ex4 {
    public static void main(String[] args) {

        // Instanciando o Scanner
        Scanner zupper = new Scanner(System.in);

        // Declarando a mensagem do leitor - salário atual

        System.out.println("Olá Zupper! Por favor, digite o seu salário atual: ");
        double salarioatual = zupper.nextDouble();

        // Declarando as variáveis de porcentagens, aumentos e novos salários

        double porcentagem15 = 0.15;
        double porcentagem10 = 0.10;
        double porcentagem5 = 0.05;

        double aumento15 = salarioatual * porcentagem15;
        double aumento10 = salarioatual * porcentagem10;
        double aumento5 = salarioatual * porcentagem5;

        double novosalario15 = (salarioatual + aumento15);
        double novosalario10 = (salarioatual + aumento10);
        double novosalario5 = (salarioatual + aumento5);

        // Declarando as condições

        if (salarioatual> 280 & salarioatual <700){
            System.out.println("Seu aumento será de 15%. " + "No valor de: " + aumento15 + "."
                    + " Portanto, seu salário com reajuste será: " + novosalario15 + ".");
        }
        else if (salarioatual> 700 & salarioatual<1500) {
            System.out.println("Seu aumento será de 10%. " + "No valor de: " + aumento10 + "."
                    + " Portanto, seu salário com reajuste será: " + novosalario10 + ".");
        }
        else if (salarioatual> 1500) {
            System.out.println("Seu aumento será de 5%. " + "No valor de: " + aumento5 + "."
                    + " Portanto, seu salário com reajuste será: " + novosalario5);
        }
        else {
            System.out.println("Por favor, digite um salário válido.");
        }
    }
}
