package DesafioModulo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        // Iniciando Scanner e a estrutura HashMap.
        Scanner leitor = new Scanner(System.in);
        Map<String, String> listaDeFuncionarios = new HashMap<String, String>();

        // Usando o tipo boolean para criar o menu.
        // A variáveil iniciar armazena a resposta do leitor no menu.
        // A variváel repetido será usada para descobrir se existe e-mail repetido no cadastro.
        boolean iniciar = true;
        int resposta = 0;
        int repetido = 0;

        System.out.println("Bem vinde, você está no Sistema De Inclusão De Colaboradores.");

        // Criar o menu para o usuário.
        while (iniciar = true) {
            System.out.println("Digite 1 para incluir um colaborador.");
            System.out.println("Digite 2 para mostrar a lista de colaboradores cadastrados.");
            System.out.println("Digite 3 para sair do sistema.");
            System.out.println("Digite 4 excluir um cadastro.");

            // Ler a resposta do usuário referente ao menu.
            resposta = leitor.nextInt();
            leitor.nextLine();

            // Incluir os dados de cadastramento.



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

                // Adicionar a chave e o valor na lista.
                listaDeFuncionarios.put(chave, valor);


                // Mostrar a lista de funcionários.
            } else if (resposta == 2) {

                System.out.println("Essa é a lista de colaboradores cadastrados: " + listaDeFuncionarios);

                // Finalizar o programa.
            } else if (resposta == 3) {
                return;

                // Mensagem para números inválidos no menu.
            } else if (resposta != 1 && resposta != 2 && resposta != 3 && resposta != 4) {
                System.out.println("Por favor, escolha um dos números disponíveis no menu.");

            } else if (resposta == 4) {
                System.out.println("Digite o CPF do colaborador que deseja excluir do cadastro: ");
                String exclusao = leitor.nextLine();

                listaDeFuncionarios.remove(exclusao);

            }

        }
    }

}
