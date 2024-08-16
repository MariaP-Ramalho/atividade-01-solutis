package br.com.dudadev.questao2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int maiorValor = encontrarMaior(valor1, valor2);

        System.out.println("O maior valor é: " + maiorValor);

        scanner.close();
    }

    public static int encontrarMaior(int a, int b) {
        return Math.max(a, b);
    }
}
