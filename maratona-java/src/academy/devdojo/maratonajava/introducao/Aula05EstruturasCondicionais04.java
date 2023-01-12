package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double anualSalary = 70000;
        double valorImposto;
        if (anualSalary <= 34712) {
            valorImposto = anualSalary * (9.70 / 100);
        } else if (anualSalary <= 68507){
            valorImposto = anualSalary * (37.35 / 100);
        } else {
            valorImposto = anualSalary * (49.50 / 100);
        }
        System.out.println("valorImposto " + valorImposto);
    }
}
