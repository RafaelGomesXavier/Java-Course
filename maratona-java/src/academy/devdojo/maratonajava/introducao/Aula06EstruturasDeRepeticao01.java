package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do-while & for

        int count = 0;
        while(count < 10){
            System.out.println("While "+ count++);
        }

        int i = 0;
        do {
            System.out.println("Do "+ i++);
        } while (i < 10);

        for(int j = 0; j < 10; j++){
            System.out.println("For "+ j);
        }
    }
}
