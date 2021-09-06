package DesafioModulo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        // Iniciando Scanner e a estrutura HashMap.
        Scanner leitor = new Scanner(System.in);
        Map<String, String> listaDeFuncionarios = new HashMap<String, String>();
        System.out.println("Bem vinde, você está no Sistema De Inclusão De Colaboradores.");

        //Criando o menu para o usuário.
        System.out.println("Digite 1 para incluir um colaborador.");
        System.out.println("Digite 2 para mostrar a lista de colaboradores cadastrados.");
        System.out.println("Digite 3 para sair do sistema.");

        int resposta = leitor.nextInt();
        leitor.nextLine();

        //Criando uma condição para realizar o que o usuário deseja fazer.

        int i = 0;

        while ( i == 0 ) {
            if (resposta == 1) {
                System.out.println("Digite o CPF: ");
                String chave = leitor.nextLine();

                System.out.println("Digite o nome: ");
                String nome = leitor.nextLine();

                System.out.println("Digite o telefone: ");
                String telefone = leitor.nextLine();

                System.out.println("Digite o e-mail: ");
                String eMail = leitor.nextLine();

                String valor = nome + "," + telefone + "," + eMail;

                // Adicionando a chave e o valor na lista de funcionários.
                listaDeFuncionarios.put(chave, valor);

                System.out.println("Digite 1 para incluir um colaborador.");
                System.out.println("Digite 2 para mostrar a lista de colaboradores cadastrados.");
                System.out.println("Digite 3 para sair do sistema.");

                resposta = leitor.nextInt();
                leitor.nextLine();

            } else if (resposta == 2) {
                System.out.println("Essa é a lista de colaboradores cadastrados: " + listaDeFuncionarios);

            } else if (resposta == 3) {

                return;
            }
        }

    }
}