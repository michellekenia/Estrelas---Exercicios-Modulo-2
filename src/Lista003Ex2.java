import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Lista003Ex2 {
    public static void main(String[] args) {

        //Instanciando o Scanner

        Scanner leitor = new Scanner(System.in);

        //Pedir ao usuario as informações necessárias

        out.println("Qual é o tipo do combustível ? Sendo A - Álcool e G - Gasolina.");
        String nomeCombustivel = leitor.nextLine();
        out.println("Quantos litros? ");
        double quantidadeL = leitor.nextDouble();

        //Criando as variáveis

        double tresPorcento = 0.03;
        double quatroPorcento = 0.04;
        double cincoPorcento = 0.05;
        double seisPorcento = 0.06;
        double precoA = 1.90;
        double precoG = 2.50;
        double descontoTotal = 0;
        double valorSemDesconto = 0;
        double valorComDesconto = 0;

        double desconto3 = 0;
        double desconto4 = 0;
        double desconto5 = 0;
        double desconto6 = 0;


        //Criando as condições e printando as mensagens dos valores dos combustíveis

        if (nomeCombustivel.equals ("A") | nomeCombustivel.equals("a")) {
            if (quantidadeL > 0 & quantidadeL <= 20) {

                desconto3 = tresPorcento* precoA;
                descontoTotal = desconto3 * quantidadeL;
                valorSemDesconto = quantidadeL*precoA;
                valorComDesconto = valorSemDesconto - descontoTotal;

                out.println( "Valor a pagar: R$ " + valorComDesconto);

            } else {

                desconto5 = cincoPorcento * precoA;
                descontoTotal = desconto5 * quantidadeL;
                valorSemDesconto = quantidadeL*precoA;
                valorComDesconto = valorSemDesconto - descontoTotal;

                out.println( "Valor a pagar: R$ " + valorComDesconto);
            }
        } else if (nomeCombustivel.equals("G") | nomeCombustivel.equals("g")) {

                if (quantidadeL > 0 & quantidadeL <= 20) {
                    desconto4 = quatroPorcento * precoG;
                    descontoTotal = desconto4 * quantidadeL;
                    valorSemDesconto = quantidadeL*precoG;
                    valorComDesconto = valorSemDesconto - descontoTotal;

                    out.println( "Valor a pagar: R$ " + valorComDesconto);

                } else {
                    desconto4 = seisPorcento * precoG;
                    descontoTotal = desconto6 * quantidadeL;
                    valorSemDesconto = quantidadeL*precoG;
                    valorComDesconto = valorSemDesconto - descontoTotal; }

                    out.println( "Valor a pagar: R$ " + valorComDesconto);

        } else {
            out.println("Digite um tipo válido de combustível");
        }
    }
}