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

        //Iniciando o Scaner e o HashMap
        Scanner leitor = new Scanner(System.in);
        Map<String, String> listaDeAlunos = new HashMap<String, String>();

        //Criando as variáveis e as mensagens necessárias para a chave e para cada um dos valores.
        System.out.print("Insira o e-mail do aluno: ");
        String chave = leitor.nextLine();

        System.out.print("Insira o nome do aluno: ");
        String nome = leitor.nextLine();

        System.out.print("Insira o telefone do aluno: ");
        String telefone = leitor.nextLine();

        String valor = nome + "," + telefone;

        //Inserindo a chave e valores criados dentro da lista.
        listaDeAlunos.put(chave, valor);

        //Criando uma variável e mensagem para saber se o usuário deseja incluir mais alunos no cadastro.
        System.out.print("Deseja adicionar mais alunos? (sim/não): ");
        String resposta = leitor.nextLine();

        // Usando while criei uma estrutura de repetição para incluir mais alunos na lista.
        //Se a resposta dfor sim ele executa novamente a inclusão de alunos, se for não finaliza o programa.

        while (resposta.equals("sim")) {

            System.out.print("Insira o e-mail do aluno: ");
            chave = leitor.nextLine();

            //Uma condição foi criada para saber se a chave e-mail já foi cadastrada.
            //Usando for each para percorrer a lista criada.
            // A variável repetido foi criada para criar uma condição dentro do for each buscando a chave.
            //Que vai retornar para a outra condição fora do for each.
            //Se repetido for = 1 então existe um email cadastrado igual ao que o usuário está tentando cadastrar,
            //se repetido não for = 1 então pode ser cadastrado normalmente.

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

        //
        System.out.println("Dados da lista de alunos: " + listaDeAlunos);

        //
        System.out.print("Deseja excluir algum aluno? (sim/não): ");
        String exclusao = leitor.nextLine();

        if (exclusao.equals("sim")) {
            System.out.print("Digite o e-mail do aluno a ser removido da lista: ");
            String alunoremovido = leitor.nextLine();

            listaDeAlunos.remove(alunoremovido);

            System.out.println("Dados da lista de alunos: " + listaDeAlunos);

        } else {
            System.out.println("Dados da lista de alunos: " + listaDeAlunos);
        }

    }


}

