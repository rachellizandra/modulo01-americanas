package Atividades;

import java.util.Scanner;

public class MaiorMenorEMedia {
    public static void main(String[] args) {

        // questão 4
        /**
         *
         * Escreva um programa que lê 5 números e informa o maior, o menor e a média deles.
         */

        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        float media = 0f;

        int numero;
        for(int i = 0; i < 5; i++) {
            System.out.printf("Informe o %dº número:", (i + 1));
            numero = scanner.nextInt();

            if(numero > maior) {
                maior = numero;
            }
            if(numero < menor) {
                menor = numero;
            }
            media = media + numero;
        }
        media = media/5;
        System.out.println("O maior número foi: " + maior);
        System.out.println("O menor número foi: " + menor);
        System.out.println("A média entre os números foi: " + media);

    }
}
