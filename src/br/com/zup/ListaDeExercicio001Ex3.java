package br.com.zup;

public class ListaDeExercicio001Ex3 {
    public static void main(String[] args) {

        //Nomeando a variável um metro em centímetros
        int umMetroEmCentimetros = 100;

        //Nomeando as variávies de metros
        int umMetro = 1;
        int doisMetros = 2;
        int cincoMetros = 5;
        int dezMetros = 10;

        //Fazendo a conversão
        int umMetroEmCm = umMetro * umMetroEmCentimetros;
        int doisMetrosEmCm = doisMetros * umMetroEmCentimetros;
        int cincoMetrosEmCm = cincoMetros * umMetroEmCentimetros;
        int dezMetrosEmCm = dezMetros * umMetroEmCentimetros;

        //Print da conversão
        System.out.println("Um metro em centímetros é: " + umMetroEmCm);
        System.out.println("Dois metros em centímetros é: " +doisMetrosEmCm);
        System.out.println("Cinco metros em centímetros é: " +cincoMetrosEmCm);
        System.out.println("Dez metros em centímetros é: " + dezMetrosEmCm);
    }
}
