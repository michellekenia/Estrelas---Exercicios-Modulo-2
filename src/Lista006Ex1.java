/*Faça um programa que pergunte o preço de três produtos e informe qual
  produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.*/

import java.util.*;

public class Lista006Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Variávies
        double valorProduto1;
        double valorProduto2;
        double valorProduto3;

        //Produtos lidos pelos usuário
        System.out.println("Digite o valor do primeiro produto: ");
        valorProduto1 = leitor.nextDouble();

        System.out.println("Digite o valor do segundo produto: ");
        valorProduto2 = leitor.nextDouble();

        System.out.println("Digite o valor do terceiro produto: ");
        valorProduto3 = leitor.nextDouble();

        //Condições
        if (valorProduto1 < valorProduto2 & valorProduto1 < valorProduto3) {
            System.out.println("Você deve comprar o produto 1, ele é o mais barato :" + "R$" + valorProduto1);

        } else if (valorProduto2 < valorProduto1 & valorProduto2 < valorProduto3) {
            System.out.println("Você deve comprar o produto 2, ele é o mais barato :" + "R$" + valorProduto2);
        } else {
            System.out.println("Você deve comprar o produto 3, ele é o mais barato :" + "R$" + valorProduto3);
        }


    }

}
