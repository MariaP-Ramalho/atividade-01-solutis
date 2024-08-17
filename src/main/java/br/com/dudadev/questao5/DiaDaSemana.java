package br.com.dudadev.questao5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia;

        String[] diasDaSemana = {
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
            dia = scanner.nextInt();

            if (dia < 1 || dia > 7) {
                System.out.println("Número inválido. Por favor, insira um número de 1 a 7.");
            } else {
                System.out.println("Dia da semana correspondente: " + diasDaSemana[dia]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro de 1 a 7.");
        }

        scanner.close();
    }
}
