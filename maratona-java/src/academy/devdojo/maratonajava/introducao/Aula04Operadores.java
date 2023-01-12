package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * /
        int numberOne = 10;
        double numberTwo = 20;
        double result = numberOne / numberTwo;

        System.out.println("Valor " + result);


        // < > <= >= == != ===
        boolean isTenBigestTweent = 10 > 20;
        boolean isTenLowerTweent = 10 < 20;
        boolean isTenEqualTweent = 10 == 20;
        boolean isTenDiffrentTweent = 10 != 20;

        System.out.println(isTenBigestTweent);
        System.out.println(isTenLowerTweent);
        System.out.println(isTenEqualTweent);
        System.out.println(isTenDiffrentTweent);


        int myAge = 29;
        float mySalary = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = myAge >= 30 && mySalary >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = myAge < 30 && mySalary >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;

        boolean isPlayStationVCrompravel = valorTotalContaCorrente >= valorPlayStation || valorTotalContaPoupanca >= valorPlayStation;

        System.out.println("isPlayStationVCrompravel " + isPlayStationVCrompravel);
    }
}
