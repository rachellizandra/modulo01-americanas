package Atividades;
import java.util.Scanner;


public class ListaDeFrutas {

    public static void main(String[] args) {
        //questão 1
        /**
         * Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras.
         * Ao final da entrada dos 5 itens, exiba a lista completa.
         */
        //opção 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o nome de 5 frutas.");
        String[] carrinhoFrutas = new String[5];


        for (int i = 0; i < carrinhoFrutas.length; i++) {
            System.out.printf("Fruta %d/5: ", i+1);
            carrinhoFrutas[i] = sc.next();
        }
        System.out.println("As frutas adicionadas ao seu carrinho são: ");

        for (String fruta : carrinhoFrutas) {
            System.out.println(fruta);
        }

        //opção 2
//        Scanner ler = new Scanner(System.in);
//
//        // [ A ] declarando e instanciando uma lista de frutas
//        ArrayList<String> lista = new ArrayList();
//
//        System.out.printf("\nInforme as frutas que você deseja:\n");
//        String entrada = ler.next();
//
//        // [ B ] usando o método add() para gravar as 5 frutas na lista
//        lista.add("banana");
//        lista.add("maçã");
//        lista.add("pera");
//        lista.add("uva");
//        lista.add("morango");
//
//        int i;
//        // [ C ] mostrando os "n" itens da lista (usando o índice)
//        // número de elementos da lista: método size()
//        System.out.printf("Sua lista de frutas foi: \n");
//        int n = lista.size(); // caso fosse uma lista com vários itens
//        for (i=0; i<n; i++) {
//            System.out.printf("Posição %d - %s\n", i, lista.get(i));
//        }
//
//        // [ E ] mostrando os "n" itens da lista (usando for-each)
//        System.out.printf("\nPercorrendo o ArrayList (usando for-each)\n");
//        int j = 0;
//        for (String fruta: lista) {
//            fruta = entrada;
//            System.out.printf("Posição %d- %s\n", j, fruta);
//            j++;
//        }


 }

}
