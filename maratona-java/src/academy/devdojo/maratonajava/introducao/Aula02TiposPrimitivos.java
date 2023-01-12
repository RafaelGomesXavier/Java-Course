package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long, boolean
        int intAge = 10;
        long bigNumbers = 100000;
        double salaryDouble = 2000;
        float salaryFloat = 2500;
        byte byteAge = 10;
        short shortAge = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        /*
          em especial a variavel char recebe apenas uma letra como 'a', 'b', 'c'...'z'
          ou números da tabela ASCI como por exemplo 87 retornando a letra W
          Podemos também utilizar a tabela unicode bastanto adicionar \ u a frente do número como '\u0041' retornando a letra A
         */
        char character = '\u0041';
        System.out.println(intAge);
        System.out.println(character);
        System.out.println(falso);
    }
}