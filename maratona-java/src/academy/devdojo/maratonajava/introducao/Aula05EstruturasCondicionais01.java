package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isIdadeMaiorQue18 = idade > 18;
        if (isIdadeMaiorQue18) {
            System.out.println("Autorizado a comprar bebidas");
        } else {
            System.out.println("Não esta autorizado");
        }
    }
}
