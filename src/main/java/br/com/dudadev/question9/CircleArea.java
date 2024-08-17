package br.com.dudadev.question9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleArea {
    private static final double PI = 3.141592653589793;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;

        while (true) {
            try {
                System.out.print("Informe o raio do círculo: ");
                radius = sc.nextDouble();

                if (radius <= 0) {
                    System.out.println("O raio deve ser um número positivo. Tente novamente.");
                    continue;
                }

                double area = PI * Math.pow(radius, 2);

                double roundedArea = Math.round(area);

                System.out.println("A área do círculo é: " + roundedArea);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                sc.next();
            }
        }

        sc.close();
    }
}

