package br.com.zup;

import java.util.concurrent.TransferQueue;

public class ListaDeExercicios001Ex5 {
    public static void main(String[] args) {
        //Armazenando o valor em Fahrenheit
        int valorEmFahrenheit = 80;

        System.out.println("Valor em Fahrenheit : " + valorEmFahrenheit + "ºF");

        //Fazendo a conversão de Fahrenheit em Celcius
        double paraConverter1 = 32;
        double paraConverter2 = 1.8;
        double gerarValorEmC = (valorEmFahrenheit - paraConverter1) / paraConverter2;

        System.out.print("Gerar Valor de Fahrenheit em Celcius : " + gerarValorEmC + "ºC");

    }
}
