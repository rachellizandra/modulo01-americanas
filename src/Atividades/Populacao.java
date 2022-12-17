package Atividades;

public class Populacao {

    public static void main(String[] args) {
        // questão 9

        /**
         * Supondo que a população do país "A" seja de 80_000 habitantes, com uma taxa anual de crescimento de 3%.
         * E que a população de B seja 200_000 habitantes, com uma taxa de crescimento de 1.5%.
         *
         * Faça um programa que calcule e escreva o número de anos necessários para que a população do país A
         * ultrapasse ou iguale a população do país B mantidas as taxas de crescimento.
         */

        double populacaoA = 80_000;
        double populacaoB = 200_000;
        int anos = 0;

        while(populacaoB > populacaoA) {
            populacaoA += (populacaoA * 0.03);
            populacaoB += (populacaoB * 0.015);
            anos++;
        }
        System.out.printf("A população A irá passar a quantidade de habitantes da população B em %d anos", anos);
    }
}
