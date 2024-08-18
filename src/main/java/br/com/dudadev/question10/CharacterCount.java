package br.com.dudadev.question10;


import java.text.Normalizer;
import java.util.Scanner;

public class CharacterCount {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira uma frase: ");
        String text = sc.nextLine();
        characterCount(text);
    }

    private static String removeAccents(String text) {
        String normalized = Normalizer.normalize(text, Normalizer.Form.NFD);
        return normalized.replaceAll("\\p{M}", "");
    }

    public static void characterCount(String text) {
        if (text == null || text.isEmpty()) {
            System.out.println("Texto vazio ou nulo.");
            return;
        }

        int vowels = 0;
        int space = 0;
        int consonants = 0;

        text = text.toLowerCase();
        text = removeAccents(text);

        for (char c : text.toCharArray()) {
            if (Character.isWhitespace(c)) {
                space++;
            } else if (isVowel(c)) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
        }

        System.out.println("Quantidade de vogais: " + vowels);
        System.out.println("Quantidade de consoantes: " + consonants);
        System.out.println("Quantidade de espaços em branco: " + space);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
