package br.com.dudadev.question2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HigherValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try{
                System.out.print("Digite o primeiro valor: ");
                int value1 = sc.nextInt();

                System.out.print("Digite o segundo valor: ");
                int value2 = sc.nextInt();

                int higherValue = Math.max(value1, value2);

                System.out.println("O maior valor é: " + higherValue);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                sc.next();
            }
        }
    }
}
