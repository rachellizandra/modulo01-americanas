package Aulas;

import java.util.Scanner;

public class Aula03 {
    public static void main(String[] argumentos) {

        //    Desenvolva um programa que vai pedir a hora e o minuto,
//    depois solicite quantidade de horas para adicionar
//    e imprima a nova hora (com as horas adicionadas) em 3 fusos diferentes;
//    ex.:
//
//    ENTRADA ->
//
//    informe a hora: 10
//    informe o minuto: 12
//


        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a hora: ");
        int hora = teclado.nextInt();

        System.out.print("Informe a minuto: ");
        int minuto = teclado.nextInt();

        System.out.print("quandidade adicionar: ");
        int add = teclado.nextInt();

        hora = hora + add;

        System.out.println("Brasil, " + hora % 24 + "h" + minuto + "min");
        System.out.println("Mexico, " + ((hora - 3) + 24) % 24 + "h" + minuto + "min");
        System.out.println("Londres, " + ((hora + 3) + 24) % 24 + "h" + minuto + "min");

    }
}
