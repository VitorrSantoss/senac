package Senac2;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma cadeia de caracteres: ");
        String texto = scanner.nextLine();
        String textoMinusculo = texto.toLowerCase();
        int contadorDeVogais = 0;

        for (int i = 0; i < textoMinusculo.length(); i++) {
            char caractere = textoMinusculo.charAt(i);

            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorDeVogais++;
            }
        }

        System.out.println("O número total de vogais encontradas é: " + contadorDeVogais);

        scanner.close();
    }
}