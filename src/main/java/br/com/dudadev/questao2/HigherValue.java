package br.com.dudadev.questao2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HigherValue {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o primeiro valor: ");
            int value1 = sc.nextInt();

            System.out.print("Digite o segundo valor: ");
            int value2 = sc.nextInt();

            int higherValue = Math.max(value1, value2);

            System.out.println("O maior valor é: " + higherValue);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }
    }
}
