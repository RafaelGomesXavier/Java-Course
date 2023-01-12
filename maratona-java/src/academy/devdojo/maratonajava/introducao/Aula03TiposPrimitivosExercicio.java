package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

    /*
    Pratica

    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte menssagem:
    Eu <nome>, morando no endereco <endereco>,
    confirmo que recebi o salario de <salario>, na data <data>.
     */
    String name = "Rafael Gomes Xavier";
    String address = "Rua dos Jasmins, 142 - Parque das Flores, São Paulo - sp";
    float salary = 2000.00f;
    String date = "12/01/2023";
    String relatorio = "Eu "+name+", morando no endereço "+address+", confirmo que recebi o salário de "+ salary +", na data "+ date;
        System.out.println(relatorio);
    }

}
