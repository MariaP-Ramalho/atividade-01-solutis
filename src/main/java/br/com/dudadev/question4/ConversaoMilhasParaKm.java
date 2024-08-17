package br.com.dudadev.question4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversaoMilhasParaKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double milhas;

        try {
            System.out.print("Digite a distância em milhas: ");
            milhas = sc.nextDouble();

            double quilômetros = milhas * 1.609;

            System.out.println("Distância em quilômetros: " + quilômetros + "Km");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número decimal válido.");
        }

        sc.close();
    }
}
