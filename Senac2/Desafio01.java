package Senac2;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String texto = sc.nextLine();
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != ' ') {
                contador++;
            }
        }
        System.out.println("Tamanho da string sem espaços é: " + contador);
    }
}
