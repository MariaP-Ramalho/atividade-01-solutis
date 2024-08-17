package br.com.dudadev.questao7;

public class DivisaoMultiplosDeTres {
    public static void main(String[] args) {

        for (int i = 3; i <= 100; i += 3) {
            int resultadoInt = i / 2;
            double resultadoDouble = (double) i / 2;
            System.out.println("Divisão de " + i + " por 2 (int): " + resultadoInt + "| Divisão de " + i + " por 2 (double): " + resultadoDouble);
        }
    }
}

