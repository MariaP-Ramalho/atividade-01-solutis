package br.com.dudadev.question12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Consumption {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalKm = 0;
        int totalLiters = 0;
        boolean remain = true;

        while (remain) {
            int km = readKm(sc);
            int liters = lerLitros(sc);

            double currentConsumption = calculateConsumption(km, liters);
            System.out.println("************************************************");
            System.out.printf("Consumo para este tanque: %.2f km/l%n", currentConsumption);

            totalKm += km;
            totalLiters += liters;

            double totalConsumption = calculateConsumption(totalKm, totalLiters);
            displayTotal(totalKm, totalLiters, totalConsumption);

            remain = remain(sc);
        }

        sc.close();
    }

    private static int readKm(Scanner sc) {
        while (true) {
            try {
                System.out.print("Digite a quilometragem dirigida (km): ");
                int km = sc.nextInt();
                if (km < 0) {
                    throw new InputMismatchException();
                }
                return km;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro positivo.");
                sc.next();
            }
        }
    }

    private static int lerLitros(Scanner sc) {
        while (true) {
            try {
                System.out.print("Digite os litros de gasolina consumidos: ");
                int liters = sc.nextInt();
                if (liters <= 0) {
                    throw new InputMismatchException();
                }
                return liters;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro positivo maior que zero.");
                sc.next();
            }
        }
    }


    private static double calculateConsumption(int km, int liters) {
        return (double) km / liters;
    }

    private static void displayTotal(int km, int liters, double totalConsumption) {
        System.out.printf("Quilometragem combinada: %d km%n", km);
        System.out.printf("Total de litros consumidos: %d l%n", liters);
        System.out.printf("Consumo médio total: %.2f km/l%n", totalConsumption);
        System.out.println("*******************************************");
    }


    private static boolean remain(Scanner sc) {
        System.out.print("Deseja inserir os dados de outro tanque? (s/n): ");
        char answer = sc.next().toLowerCase().charAt(0);
        return answer == 's';
    }
}

