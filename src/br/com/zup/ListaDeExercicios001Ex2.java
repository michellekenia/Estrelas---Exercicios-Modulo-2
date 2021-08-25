package br.com.zup;

public class ListaDeExercicios001Ex2 {
    public static void main(String[] args) {

        // Armazenar os valores das notas
        int nota1 = 10;
        int nota2 = 6;
        int nota3 = 10;
        int nota4 = 6;

        //Print das notas
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);

        // Somando os valores das notas
        int somaDasNotas = nota1 + nota2 + nota3 + nota4;

        //Print da soma das notas
        System.out.println("A soma das notas é:" + somaDasNotas);

        //Fazendo a média aritmética
        int mediaAritmetica = somaDasNotas / 4;

        //Dando print na média aritmética
        System.out.println("A nota final é : " + mediaAritmetica);




    }
}
