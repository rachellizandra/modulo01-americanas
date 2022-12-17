package Atividades;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {

        //questão 7

        /**
         *Escreva um programa que lê nome e idade de 5 pessoas
         * e ao final informa quem é o mais novo, o mais velho e qual a média de idade.
         *
         */

        Scanner scanner = new Scanner(System.in);
        String nome = "";
        String nomeMaisVelho = "";
        String nomeMaisNovo = "";
        int idadeMaisVelho = Integer.MIN_VALUE;
        int idadeMaisNovo= Integer.MAX_VALUE;

        float media = 0f;
        String enter = "";


        int idade;
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome da " + (i+1) + "ª pessoa: ");
            nome = scanner.nextLine();
            System.out.println("Digite a idade da " + (i+1) +"ª pessoa: ");
            idade = scanner.nextInt();
            enter = scanner.nextLine();

            if(idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
                nomeMaisVelho = nome;
            }

            if(idade > idadeMaisNovo) {
                idadeMaisNovo = idade;
                nomeMaisNovo = nome;
            }
            media = media + idade;
        }
        media = media / 5;
        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);
        System.out.println("A pessoa mais velha é: " + nomeMaisVelho);
        System.out.println("A média de idade entre elas é: " + media);
    }
}
