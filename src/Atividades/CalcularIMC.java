package Atividades;
import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {
        // questão 8
        //NÃO ESTÁ PEGANDO TESTAR NOVAMENTE

        /**
         * Escreva um programa que lê nome, altura e peso de 5 pessoas,
         * calcula o IMC de cada um e ao final informa se alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25).
         * Fórmula = IMC = Peso / Altura²
         */

        Scanner scanner = new Scanner(System.in);

        String nome = "";
        float altura = 0f;
        float peso = 0f;

        String[] acimaDoPeso = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Escreva o nome da " + (i + 1) + "ª pessoa: ");
            nome = scanner.nextLine();
            System.out.println("Escreva a altura da " + (i + 1) + "ª pessoa: ");
            altura = scanner.nextFloat();
            System.out.println("Escreva o peso da " + (i + 1) + "ª pessoa: ");
            peso = scanner.nextFloat();
            scanner.nextLine();

            float imc = peso / (altura * altura);
            if (imc < 18.5 && imc > 25) {
                acimaDoPeso[i] = nome;
            }
        }

        System.out.println("Pessoas fora do peso ideal:");
        for (int i = 0; i < 5; i++) {
            if (acimaDoPeso[i] != null) {
                System.out.println(acimaDoPeso[i]);
            }
        }
        }
    }

