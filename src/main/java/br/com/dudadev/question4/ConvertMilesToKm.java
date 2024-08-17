package br.com.dudadev.question4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertMilesToKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double miles;

        try {
            System.out.print("Digite a distância em milhas: ");
            miles = sc.nextDouble();

            double km = miles * 1.609;

            System.out.println("Distância em quilômetros: " + km + "Km");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número decimal válido.");
        }

        sc.close();
    }
}
