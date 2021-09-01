
/* Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 2 vezes. A
primeira vez com "for" e a segunda com "while". */
public class Lista007Ex1 {
    public static void main(String[] args) {

        System.out.println("Usando While");
        System.out.println("Números de 1 a 100:" );

        int contador = 1;
        while (contador <= 100) {

            System.out.println(contador);

            contador ++;
        }

        System.out.println("Usando For");
        System.out.println("Números de 1 a 100:" );
        for (int contador1 = 1; contador1 <=100; contador1++) {
            System.out.println(contador1);
        }

    }
}
