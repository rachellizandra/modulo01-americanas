package ProjetoFinal;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        /**
         * colocar dentro do while - ok
         * saber a vez de cada jogador - ok
         * fazer joagada - ok
         * ver se a jogada é valida - ok
         * por posição exitente - ok
         * posição vazia - ok
         * ver se o jogo acabou
         * ver se deu velha
         *  ver se alguem ganhou
         *      ver na linhas
         *      ver nas colunas
         *      ver nas diagonais
         * se acabou, repetir tudo(while)
         * */

        /**
         *             _|_|_
         *             _|_|_
         *             _|_|_
         */

        Character[][] tab = new Character[3][3];

        Jogo jogo = new Jogo();


        Scanner scanner = new Scanner(System.in);


        int linha = 0;
        int coluna = 0;

        int numeroJogadas = 0;

        while(numeroJogadas < 10 && tabuleiroCompleto(tab, linha, coluna) == false) {

            imprimirTabuleiro(tab);
            System.out.println("O jogador da vez é:" + jogo.getJogadorAtual());

            System.out.println("Digite a linha:");
            linha = scanner.nextInt();
            System.out.println("Digite a coluna:");
            coluna = scanner.nextInt();

            if(fazerJogada(tab, linha, coluna, jogo.getJogadorAtual()) == true) {
                jogo.mudarJogador();
                numeroJogadas++;
                System.out.println("Numero de jogadas: " + numeroJogadas);
            } else {
                System.out.println("Jogada inválida! Jogue novamente");
            }
        }

        //boolean testeVerificarVazio = verificarPosicaoVazia(tab, linha, coluna);
        //boolean testeVerificarJogoCompleto = tabuleiroCompleto(tab, linha, coluna);

        //fazerJogada(tab, linha, coluna, jogo.getJogadorAtual());
        //System.out.println(testeVerificarVazio);
        //System.out.println(testeVerificarJogoCompleto);

    }

    public static void imprimirTabuleiro(Character[][] tab) {
        System.out.println();

        for(int indiceLinha = 0; indiceLinha < 3; indiceLinha++) {
            Character[] linha = tab[indiceLinha];

            for(int indiceColuna = 0; indiceColuna < 3; indiceColuna++) {
                Character elemento = tab[indiceLinha][indiceColuna];

                if(elemento == null) {
                    System.out.print("__");
                } else {
                    System.out.print(elemento);
                }

                if(indiceColuna != 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }


    public static boolean fazerJogada(Character[][] tab, int linha, int coluna, Character jogadorAtual) {
        if(verificarPosicaoVazia(tab, linha, coluna) == true) {
            tab[linha][coluna] = jogadorAtual;
            return true;
        }
        return false;
    }

    public static boolean verificarPosicaoVazia(Character[][] tab, int linha, int coluna) {

        if(linha >= 0 && linha < 3) {
            if(coluna >=0 && coluna < 3) {
                if(tab[linha][coluna] == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean tabuleiroCompleto(Character[][] tab, int linha, int coluna) {
        int posicoesCompletas = 0;
        for(linha=0 ; linha<3 ; linha++) {
            for(coluna=0 ; coluna<3 ; coluna++) {
                if(tab[linha][coluna] != null ) {
                    posicoesCompletas++;
                }
            }
        }
        if(posicoesCompletas == 9) {
            System.out.println("Tabuleiro completo");
            return true;
        }
        return false;
    }
}


class Jogo {
    char jogador1 = 'X';
    char jogador2 = 'O';

    Character jogadorAtual = jogador1;

    public void mudarJogador() {
        if(jogadorAtual == jogador1) {
            jogadorAtual = jogador2;
        } else {
            jogadorAtual = jogador1;
        }
    }

    public Character getJogadorAtual() {
        return jogadorAtual;
    }

}
