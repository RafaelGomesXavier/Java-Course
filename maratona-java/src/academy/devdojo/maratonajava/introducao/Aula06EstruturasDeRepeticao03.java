package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // imprima os primeiros 25 números de um dado valor, por exemplo 50
    public static void main(String[] args) {
        int max = 50;
        for (int i = 0; i < max; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}

