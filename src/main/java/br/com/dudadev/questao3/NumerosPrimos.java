package br.com.dudadev.questao3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosPrimos {

    public static boolean VerificaPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        try {
            System.out.print("Digite um número inteiro positivo: ");
            num = sc.nextInt();

            if (num < 0) {
                System.out.println("Número inválido. Por favor, insira um número inteiro positivo.");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            return;
        }

        System.out.println("Números primos menores que " + num + ":");
        for (int i = 2; i < num; i++) {
            if (VerificaPrimo(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}