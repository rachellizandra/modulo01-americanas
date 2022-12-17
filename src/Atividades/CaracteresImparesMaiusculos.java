package Atividades;
import java.util.Scanner;

public class CaracteresImparesMaiusculos {
    public static void main(String[] args) {

        //questão 6

        /**
         * Escreva um programa que lê uma palavra e escreve de volta com os caracteres ímpares em maiúsculo.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        char[] array = palavra.toCharArray();

        for(int i = 0; i < array.length; i++) {
            if((i+1) % 2 != 0) {
                System.out.print((array[i] + "").toUpperCase());
            } else {
                System.out.print((array[i] + "").toLowerCase());
            }
        }
        System.out.println();
    }
}
