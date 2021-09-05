/*
Crie um programa para gerenciar uma lista de alunos, cada aluno tem nome,
telefone e email. No final do programa deve ser exibido a lista de alunos
cadastrados.

Entrega Mínima: O sistema permite, via terminal, inserir pelo menos 1 aluno em
uma lista e retornar o mesmo na tela.

Entrega Média: O sistema permite adicionar mais de um aluno e apresenta um
menu para decidir se deverá adicionar mais alunos ou encerrar o programa.

Entrega Máxima: O Sistema permite excluir um aluno usando como parâmetro o
email e não permite inserir um aluno com o email repetido.
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LevelUp {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Map<String, String> listaDeAlunos = new HashMap<String, String>();

        System.out.print("Insira o e-mail do aluno: ");
        String chave = leitor.nextLine();

        System.out.print("Insira o nome do aluno: ");
        String nome = leitor.nextLine();

        System.out.print("Insira o telefone do aluno: ");
        String telefone = leitor.nextLine();

        String valor = nome + "," + telefone;

        listaDeAlunos.put(chave, valor);

        System.out.print("Deseja adicionar mais alunos? (sim/não): ");
        String resposta = leitor.nextLine();

        while (resposta.equals("sim")) {

            System.out.print("Insira o e-mail do aluno: ");
            chave = leitor.nextLine();

            int repetido = 0;
            for (String verificacao : listaDeAlunos.keySet()) {
                if (chave.equals(verificacao)) {
                    repetido = 1;
                }
            }

            if (repetido == 1) {
                System.out.println("Esse e-mail já está cadastrado. Insira outro e-mail.");
            } else {
                System.out.print("Insira o nome do aluno: ");
                nome = leitor.nextLine();

                System.out.print("Insira o telefone do aluno: ");
                telefone = leitor.nextLine();

                valor = nome + "," + telefone;

                listaDeAlunos.put(chave, valor);

                System.out.print("Deseja adicionar mais alunos? (sim/não): ");
                resposta = leitor.nextLine();

            }


        }

        System.out.println("Dados da lista de alunos: " + listaDeAlunos);
        System.out.println("Deseja excluir algum aluno?");




    }


}
