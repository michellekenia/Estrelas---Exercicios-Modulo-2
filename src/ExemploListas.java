import java.util.ArrayList;
import java.util.List;

public class ExemploListas {
    public static void main(String[] args) {

        List<String> alunos = new ArrayList<>();

        alunos.add("Michelle");
        alunos.add("Kênia");
        alunos.add("Letícia");
        alunos.add("Camile");

        for (String referencia : alunos) {
            //System.out.println(referencia);
            if (referencia.contains("Camile")) {
                System.out.println("Aluna Cadastrada");
            } else {
                System.out.println("Aluna não cadastrada");
            }

        }

    }


}

