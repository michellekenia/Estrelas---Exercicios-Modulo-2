package br.com.zup;

public class ListaExercicios001Ex6 {

    public static void main(String[] args) {
        //Quantidade de horas trabalhadas por dia
        int horasTrabalhadasPorDia = 6;

        //Valor por hora trabalhada
        int valorPorHoraTrabalhada= 10;

        //Quantidade de horas trabalhadas no mês
        int diasUteisNoMes = 22;
        int horasTrabalhadasPorMes = horasTrabalhadasPorDia * diasUteisNoMes;

        //Valor do salário bruto
        int salarioBruto = horasTrabalhadasPorMes * valorPorHoraTrabalhada;

        // Descontos
        double descontoImpostoDeRenda = 0.11;
        double descontoDoInss = 0.08;
        double descontoDoSindicato = 0.05;

        //Valor dos descontos
        double valorDescontoImpostoDeRenda = salarioBruto * descontoImpostoDeRenda;
        double valorDescontoInss = salarioBruto * descontoDoInss;
        double valorDescontoDoSindicato = salarioBruto * descontoDoSindicato;
        double somaDosDescontos = (valorDescontoImpostoDeRenda + valorDescontoInss + valorDescontoDoSindicato);

        //Salário após os descontos
        double salarioLiquido = (salarioBruto - somaDosDescontos);

        //Printar as informações pedidas pelo exercício

        System.out.println("Seu salário bruto é : " + salarioBruto);
        System.out.println("O desconto pago ao INSS foi de : " + valorDescontoInss);
        System.out.println("O desconto pago ao sindicato foi de : " + valorDescontoDoSindicato);
        System.out.println("O seu salário líquido é : " + salarioLiquido);
    }
}
