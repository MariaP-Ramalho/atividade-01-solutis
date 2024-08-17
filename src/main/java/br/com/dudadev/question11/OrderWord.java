package br.com.dudadev.question11;

import java.util.Scanner;

public class OrderWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String word1 = sc.nextLine().trim();
        System.out.print("Digite a segunda palavra: ");
        String word2 = sc.nextLine().trim();

        if (word1.isEmpty() || word2.isEmpty()) {
            System.out.println("Ambas as palavras devem ser não vazias.");
            sc.close();
            return;
        }

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        if (word1.compareTo(word2) < 0) {
            System.out.println("Palavras em ordem alfabética:");
            System.out.println(word1);
            System.out.println(word2);
        } else {
            System.out.println("Palavras em ordem alfabética:");
            System.out.println(word2);
            System.out.println(word1);
        }

        if (word1.length() > word2.length()) {
            System.out.println("A palavra com o maior número de caracteres é: " + word1);
        } else if (word1.length() < word2.length()) {
            System.out.println("A palavra com o maior número de caracteres é: " + word2);
        } else {
            System.out.println("Ambas as palavras têm o mesmo número de caracteres.");
        }

        sc.close();
    }
}
