package br.com.zup;

public class ListaDeExercicios001Ex4 {
    public static void main(String[] args) {

        //Armazenando o valor por hora trabalhada
        int valorPorHoraTrabalhada = 10;

        //Dando print valor da hora
        System.out.println("Valor da hora trabalhada: " + valorPorHoraTrabalhada + "R$");

        //Armazenando a quantidade de horas trabalhadas por dia
        int horasTrabalhadasPorDia = 6;

        //Armazenando a quantidade de horas trabalhadas por mês
        int diasUteisDoMes = 22;
        int horasTrabalhadasPorMes = diasUteisDoMes * horasTrabalhadasPorDia;

        //Dando print horas trabalhadas no mês
        System.out.println("Horas trabalhadas no mês: " + horasTrabalhadasPorMes + "Hrs");

        //Armazenando o salário do mês
        int salarioDoMes = horasTrabalhadasPorMes * valorPorHoraTrabalhada;

        //Dando print
        System.out.println("Salário do mês : " +salarioDoMes + "R$");

    }
}
