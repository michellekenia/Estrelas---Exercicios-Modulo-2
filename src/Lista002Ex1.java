import java.util.Scanner;

public class Lista002Ex1 {
    public static void main(String[] args) {

        //Instanciando o Scanner
        Scanner leitor = new Scanner(System.in);

        //Declarando as variáveis

        System.out.println("Digite o primeiro número: ");
        double primeiroNumero = leitor.nextDouble ();

        System.out.println("Digite o segundo número: ");
        double segundoNumero = leitor.nextDouble();

        //Verificando qual número é maior
        if (primeiroNumero > segundoNumero) {
            System.out.println("O primeiro número é o maior número");
        }
        else {
        System.out.println("O segundo número é o maior número");
        }
    }

}
