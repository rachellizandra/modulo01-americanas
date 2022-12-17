package Aulas;

import java.util.Scanner;
import java.util.Arrays;

public class Aula06 {

    public static void main(String[] args) {
        //LOOPS

        /**
         * Exercício
         *
         * 1. Faça um programa que leia 5 números e informe o maior número.
         *
         * 2.Faça um programa que receba dois números inteiros e
         *      gere os números inteiros que estão no
         *      intervalo compreendido por eles.
         * 3. Imprimir a tabuada de 1 até 9
         */
        //exemplo1
//
//        for(int = 0; i < 10; i += 2) {
//            for (int j = 0; j < 10; j++) {
//                System.out.println("for do J: " + j);
//            }
//            System.out.println("for do I: " + i);
//        }

        //exemplo2 usando loop
//        Scanner scanner = new Scanner(System.in);
//        int numero, aux = Integer.MIN_VALUE;
//
//        for(int i = 0; i < 5; i++) {
//            System.out.printf("Informe %dº número:", (i + 1));
//            numero = scanner.nextInt();
//
//            if(numero > aux) {
//                aux = numero;
//            }
//        }
//        System.out.println("O maior número foi: " + aux);

        //exemplo2 usando array
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite um número:");
            array[i] = scanner.nextInt();
        }
        //System.out.println(Arrays.toString(array));

        int maior = array[0];
        for(int i = 0; i < array.length; i++){
            if(maior < array[i]) {
                maior = array[i];
            }
        }
        System.out.println("O maior número do array é: " + maior);

        // EXERCICIO 3

//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                int resultado = i * j;
//                System.out.printf("%d * %d = %d", i, j, resultado);
//                System.out.println();
//            }
//            System.out.println();
//        }

        // EXERCICIO2

//
//        System.out.print("Informe a hora: ");
//        int hora = teclado.nextInt();


    }
}



