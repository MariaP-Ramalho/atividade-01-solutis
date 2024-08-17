package br.com.dudadev.question6;

public class OddNumebersProduct {

    public static void main(String[] args) {

        int intProduct = 1;
        float floatPoduct = 1.0f;

        for (int i = 15; i <= 30; i += 2) {
            intProduct *= i;
            floatPoduct *= i;
        }

        System.out.println("Produto dos números ímpares de 15 a 30 (int): " + intProduct);
        System.out.println("Produto dos números ímpares de 15 a 30 (float): " + floatPoduct);
    }
}