package Senac2;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String texto = sc.nextLine();

        String invertida = new StringBuilder(texto).reverse().toString();

        if (texto.equals(invertida)){
            System.out.println("É uma PALÍNDROMO");
        }
        else {
            System.out.println("Não é um PALÍNDROMO");
        }

    }
}
