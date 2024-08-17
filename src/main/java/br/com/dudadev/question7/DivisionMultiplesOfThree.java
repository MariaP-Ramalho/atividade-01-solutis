package br.com.dudadev.question7;

public class DivisionMultiplesOfThree {
    public static void main(String[] args) {

        for (int i = 3; i <= 100; i += 3) {
            int intResult = i / 2;
            double doubleResult = (double) i / 2;

            System.out.println("Divisão de " + i + " por 2 (int): " + intResult + "| Divisão de " + i + " por 2 (double): " + doubleResult);
        }
    }
}

