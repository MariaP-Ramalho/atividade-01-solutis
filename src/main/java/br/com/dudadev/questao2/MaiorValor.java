package br.com.dudadev.questao2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaiorValor {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o primeiro valor: ");
            int valor1 = sc.nextInt();

            System.out.print("Digite o segundo valor: ");
            int valor2 = sc.nextInt();

            int maiorValor = Math.max(valor1, valor2);

            System.out.println("O maior valor é: " + maiorValor);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }
    }
}
