package Senac2;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digita algo: ");
        String texto = sc.nextLine().toUpperCase();

        System.out.println("Texto em caixa alta: " + texto);

    }
}
