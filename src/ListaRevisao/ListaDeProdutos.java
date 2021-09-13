package ListaRevisao;

import java.util.HashMap;
import java.util.Scanner;

public class ListaDeProdutos {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        HashMap<String, Double> ListaDeProdutos = new HashMap<String, Double>();

        System.out.println("Menu - Lista de Produtos do Supermercado: ");

        int resposta = 0;

        while (true) {
            System.out.println("Digite 1 se deseja adicionar produtos a lista.");
            System.out.println("Digite 2 se deseja exibir a lista dos produtos.");
            System.out.println("Digite 3 se deseja excluir um produto da lista.");

            resposta = leitor.nextInt();
            leitor.nextLine();

            if (resposta == 1) {
                System.out.print("Digite o nome do produto: ");
                String chave = leitor.nextLine();


                System.out.print("Digite o valor do produto: ");
                Double valor = leitor.nextDouble();

                ListaDeProdutos.put(chave, valor);

            } else if (resposta == 2) {
                System.out.println("Essa é a lista de produtos cadastrados: " + ListaDeProdutos);

            } else if (resposta == 3) {
                System.out.print("Digite o nome do produto que deseja excluir: ");
                String excluir = leitor.nextLine();

                ListaDeProdutos.remove(excluir);


            }
        }


    }


}
