package br.com.dudadev.question8;

import java.util.Scanner;

public class CheckWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma palavra para descobrir se é um palíndromo");
        String word = sc.nextLine();

        System.out.println(checkPalindrome(word));
    }

    public static String checkPalindrome(String word) {

        String cleanWord = word.replaceAll("\\s+", "").toLowerCase();
        int length = cleanWord.length();

        for (int i = 0; i < cleanWord.length() / 2; i++) {
            if (cleanWord.charAt(i) != cleanWord.charAt(length - i - 1)) {
                return "A palavra '" + word + "' não é um palíndromo.";
            }
        }

        return "A palavra '" + word + "' é um palíndromo.";
    }

}

