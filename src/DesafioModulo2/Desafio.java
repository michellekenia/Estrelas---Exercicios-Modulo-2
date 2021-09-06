package DesafioModulo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        //Iniciando Scanner e a estrutura HashMap
        Scanner leitor = new Scanner(System.in);
        Map<String, String> listaDeFuncionarios = new HashMap<String, String>();

        //Criando as variáveis e as mensagens necessárias para a chave e para cada um dos valores.

        System.out.println("Para cadastrar um novo funcionário insira os dados solicitados.");

        System.out.println("Digite o CPF: ");
        String chave = leitor.nextLine();

        System.out.println("Digite o nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o telefone: ");
        String telefone = leitor.nextLine();

        System.out.println("Digite o e-mail: ");
        String eMail = leitor.nextLine();

        String valor = nome + "," + telefone + "," + eMail;

        //Adicionando a chave e o valor na lista de funcionários
        listaDeFuncionarios.put(chave, valor);

        //Criando uma variável e mensagem para saber o que o usuário deseja fazer.
        System.out.println("Digite 1 para adicionar mais funcinários, 2 Para mostrar a lista dos funcionários ou 3 para encerrar o programa.");
        Integer resposta = leitor.nextInt();

        //Criando uma estrutura de repetição para realizar o que o usuário deseja fazer.

        if (resposta == 1) {

            System.out.println("Digite o CPF: ");
            chave = leitor.nextLine();

            System.out.println("Digite o nome do funcionário: ");
            nome = leitor.nextLine();

            System.out.println("Digite o telefone do funcionário: ");
            telefone = leitor.nextLine();

            System.out.println("Digite o e-mail do funcionário: ");
            eMail = leitor.nextLine();

        } else if (resposta == 2) {
            System.out.println("Essa é a lista de funcinários cadastrados: " + listaDeFuncionarios);

        } else if (resposta == 3) {
            return;
        }

        //System.out.println("Essa é a lista de funcinários cadastrados: " + listaDeFuncionarios);

    }
}
