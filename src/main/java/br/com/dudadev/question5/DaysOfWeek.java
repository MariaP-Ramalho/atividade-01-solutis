package br.com.dudadev.question5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DaysOfWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;

        String[] daysOfWeek = {
                "Inválido",
                "Segunda-feira",
                "Terça-feira",
                "Quarta-feira",
                "Quinta-feira",
                "Sexta-feira",
                "Sábado",
                "Domingo"
        };

        try {
            System.out.print("Digite um número de 1 a 7 para o dia da semana: ");
            day = sc.nextInt();

            if (day < 1 || day > 7) {
                System.out.println("Número inválido. Por favor, insira um número de 1 a 7.");
            } else {
                System.out.println("Dia da semana correspondente: " + daysOfWeek[day]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro de 1 a 7.");
        }

        sc.close();
    }
}
