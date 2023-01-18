package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // variaveis sem atribuição de valor retornam:
        /*
        byte, int, short, long, float e double = 0
        char = '\u0000' = ' ' -> espaço vazio
        boolean = false
        String e variaveis de referência retornam = null
         */
        String[] nomes = new String[3];
        nomes[0] = "Rafael";
        nomes[2] = "Leigislane";
        //nomes[1] = "Pelé";

        for(int i = 0; i < nomes.length; i++){
            if(nomes[i] == null){
                System.out.println(nomes[i] = "Foi jogar no vasco");
                break;
            }
            System.out.println(nomes[i]);
        }

    }
}
