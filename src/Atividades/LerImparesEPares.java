package Atividades;

import java.util.Scanner;


public class LerImparesEPares {
    public static void main(String[] args) {

        //questão 3
        /**
         *  Escreva um programa que lê 5 números. Ao final, escreva primeiros todos os ímpares,
         *  depois todos os pares.
         */

        //exemplo2 usando array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 números para separar em par e ímpar:");
        int[] arrayPar = new int[5];
        int contarPares = 0;
        int[] arrayImpar = new int[5];
        int contarImpares = 0;

        for(int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();

            if(numero % 2 == 0) {
                arrayPar[contarPares++] = numero;
            } else {
                arrayImpar[contarImpares++] = numero;
            }
        }
        System.out.printf("Os pares: %d", arrayPar[0]);
        for (int i = 1; i < arrayPar.length; i++) {
            if(arrayPar[i] == 0) {
                break;
            }
            System.out.printf(", %d", arrayPar[i]);
        }

        System.out.println();

        System.out.printf("Os ímpares: %d", arrayImpar[0]);
        for (int i = 1; i < arrayImpar.length; i++) {
            if(arrayImpar[i] == 0) {
                break;
            }
            System.out.printf(", %d", arrayImpar[i]);
        }

    }
}
