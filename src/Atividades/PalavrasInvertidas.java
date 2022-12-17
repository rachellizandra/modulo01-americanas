package Atividades;
import java.util.Scanner;

public class PalavrasInvertidas {

    public static void main(String[] args) {

        //questão 2
        /**
         * Escreva um programa que lê uma palavra e a escreve de volta ao contrário.
         */

        //opção 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite uma palavra para ser invertida: ");
//        String palavra = scanner.nextLine();
//
//        char[] vetorPalavra = palavra.toCharArray();
//        char[] palavraReversa = new char[vetorPalavra.length];
//
//        for(int indice = vetorPalavra.length - 1; indice>=0; indice--) {
//            palavraReversa[vetorPalavra.length-indice-1] = vetorPalavra[indice];
//        }
//        System.out.println("Palavra: " + palavra);
//        System.out.println("Palavra invertida: " + new String(palavraReversa));

        //opção 2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra para ser invertida: ");

        String palavra = scanner.next();
        String palavraInvertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida = palavraInvertida + Character.toString(palavra.charAt(i));
        }
        System.out.println("Palavra escolhida: " + palavra);
        System.out.println("Palavra invetida: " + palavraInvertida);
    }



}
