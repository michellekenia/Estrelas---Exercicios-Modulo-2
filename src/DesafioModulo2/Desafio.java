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

        System.out.print("Insira o CPF do funcionário: ");
        String chave = leitor.nextLine();

        System.out.print("Insira o nome do funcionário: ");
        String nome = leitor.nextLine();

        System.out.print("Insira o telefone do funcionário: ");
        String telefone = leitor.nextLine();

        System.out.print("Insira o e-mail do funcionário: ");
        String eMail = leitor.nextLine();

        String valor = nome + "," + telefone + "," + eMail;

        //Adicionando a chave e o valor na lista de funcionários
        listaDeFuncionarios.put(chave, valor);

        System.out.println("Essa é a lista de funcinários cadastrados: " + listaDeFuncionarios);


    }
}
