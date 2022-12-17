package Atividades;

import java.util.Scanner;

public class NomeMaisLongo {
    public static void main(String[] args) {

        //questão 5
        /**
         * Escreva um programa que lê o nome de 5 pessoas e armazena numa lista de convidados.
         * Ao final, informe qual o nome mais longo presente na lista.
         */

        Scanner scanner = new Scanner(System.in);

        String[] pessoas = new String[5];
        String convidado = "";
        int indiceDoConvidado = 0;

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do " + (i+1) + "º convidado: ");
            convidado = scanner.nextLine();
            pessoas[i] = convidado;
        }

        for(int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].length() > pessoas[indiceDoConvidado].length()) {
                indiceDoConvidado = i;
            }
        }
        System.out.println("O nome mais longo do convidado é: " + pessoas[indiceDoConvidado]);
    }
}
