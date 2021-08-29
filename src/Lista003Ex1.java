import java.util.Scanner;

import static java.lang.System.*;

public class Lista003Ex1 {
    public static void main(String[] args) {

        //Instanciando o Scanner
        Scanner leitor = new Scanner(in);

        //Pedir ao usuario as informações necessárias
        out.println ("Por favor, digite o valor da sua hora de trabalho : ");
        double horaDeTrabalho = leitor.nextDouble();

        out.println ("Por favor, digite quantas horas você trabalha por mês:  ");
        double horasTrabalhadas = leitor.nextDouble();

        //Criando as variáveis
        double salarioBruto = horaDeTrabalho * horasTrabalhadas;
        double descontoIR = 0;
        double descontoINSS = 0;
        double valorFGTS = 0;
        double valorDescontos = 0;
        double salarioLiquido = 0;

        //Criando as condições
        if (salarioBruto > 0) {

            if (salarioBruto <= 900) {
                descontoIR = 0;
                descontoINSS = 0.1;
                valorFGTS = 0.11;

            } else if (salarioBruto > 900 & salarioBruto <= 1500) {
                descontoIR = 0.05;
                descontoINSS = 0.1;
                valorFGTS = 0.11;

            } else if (salarioBruto > 1500 & salarioBruto <= 2500) {
                descontoIR = 0.1;
                descontoINSS = 0.1;
                valorFGTS = 0.11;

            } else if (salarioBruto > 2500) {
                descontoIR = 0.2;
                descontoINSS = 0.1;
                valorFGTS = 0.11;
            }

            //Valores de desconto e salário líquido
            valorDescontos = (descontoINSS*salarioBruto + descontoIR*salarioBruto);
            salarioLiquido = salarioBruto - (valorDescontos);

            //Variáveis para incluir a porcentagem no print
            double valorEmPorcentagemDoIR = (descontoIR * 100);
            double valorEmPorcentagemINSS = (descontoINSS * 100);
            double valorEmPorcentagemFGTS = (valorFGTS * 100);

            System.out.println(" Salário Bruto: " +  "("  + (horaDeTrabalho) + "*" + (horasTrabalhadas) +  "): R$ " + salarioBruto);
            System.out.println(" (-) IR" + "(" + valorEmPorcentagemDoIR + " %)             : R$ " + descontoIR*salarioBruto);
            System.out.println(" (-) INSS" + "(" + valorEmPorcentagemINSS + " %)          : R$ " + descontoINSS*salarioBruto);
            System.out.println(" FGTS" + "(" + valorEmPorcentagemFGTS + " %)              : R$ " + valorFGTS*salarioBruto);
            System.out.println(" Total de descontos        : R$ " + valorDescontos);
            System.out.println(" Salário Líquido           : R$ " + salarioLiquido);
        }
         else {System.out.println("Digite um número maior do que 0. ");

        }

    }

}
