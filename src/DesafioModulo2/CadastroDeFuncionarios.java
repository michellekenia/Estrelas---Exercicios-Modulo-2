/*
Crie um programa para gerenciar uma lista de funcionários de uma empresa,
cada funcionário tem nome, telefone, email e CPF. No final do programa deve ser
exibida a lista de funcionários cadastrados.
Entrega Mínima: O sistema permite, via terminal, inserir pelo menos 1 funcionário
em uma lista e retornar o mesmo na tela.
Entrega Média: O sistema permite adicionar mais de um funcionário e apresenta
um menu para decidir se deverá:
1. Adicionar mais funcionários.
2. Exibir a lista de todos os funcionários cadastrados.
3. Encerrar o programa.
Entrega Máxima: O Sistema permite excluir um funcionário usando como
parâmetro o CPF e não permite inserir um funcionário com o CPF repetido.
 */

package DesafioModulo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CadastroDeFuncionarios {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Map<String, String> listaDeFuncionarios = new HashMap<String, String>();

        int resposta = 0;
        int repetido = 0;

        System.out.println("Bem vinde, você está no Sistema De Inclusão De Funcionários.");

        while (true) {
            System.out.println("Digite 1 para incluir um funcionário.");
            System.out.println("Digite 2 para mostrar a lista de funcionários cadastrados.");
            System.out.println("Digite 3 para sair do sistema.");
            System.out.println("Digite 4 para excluir um cadastro.");

            resposta = leitor.nextInt();
            leitor.nextLine();

            if (resposta == 1) {
                System.out.println("Digite o CPF: ");
                String chave = leitor.nextLine();

                for (String verificação : listaDeFuncionarios.keySet()) {
                    if (chave.equals(verificação)) {
                        repetido = 1;
                    }
                }

                if (repetido == 1) {
                    System.out.println("Este CPF já foi cadastrado.");

                } else {

                    System.out.println("Digite o nome: ");
                    String nome = leitor.nextLine();

                    System.out.println("Digite o telefone: ");
                    String telefone = leitor.nextLine();

                    System.out.println("Digite o e-mail: ");
                    String eMail = leitor.nextLine();

                    String valor = nome + "," + telefone + "," + eMail;

                    listaDeFuncionarios.put(chave, valor);
                }


            } else if (resposta == 2) {

                System.out.println("Essa é a lista de funcionários cadastrados: " + listaDeFuncionarios);

            } else if (resposta == 3) {
                return;

            } else if (resposta == 4) {
                System.out.println("Digite o CPF do funcionário que deseja excluir do cadastro: ");
                String exclusao = leitor.nextLine();

                listaDeFuncionarios.remove(exclusao);

            } else {
                System.out.println("Por favor, escolha um dos números disponíveis no menu.");
            }

        }

    }

}
