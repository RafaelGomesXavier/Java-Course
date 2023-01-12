package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    // dado os valores de 1 a 7, imprima se é dia útil ou final de semana
    // considerando 1 como domingo

    public static void main(String[] args) {
        byte dia = 1;
        switch (dia){
            case 1:
            case 7:
                System.out.println("FINAL DE SEMANA");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("DIA ÚTIL");
                break;
            default:
                System.out.println("OPIÇÃO INVALIDA");
                break;
        }
    }
}
