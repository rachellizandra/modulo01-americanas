package ProjetoFinal;

public class JogoDaVelha {

    public static void main(String[] args) {

        /**
         * colocar dentro do while
         * saber a vez de cada jogador - ok
         * fazer joagada
         * ver se a jogada é valida
         *  por posição exiteste
         *  posição vazia
         * ver se o jogo acabou
         *  ver se deu velha
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
        int[] posicaoArray = {1,2};
        boolean testeVerificarVazio = verificarPosicaoVazia(tab, posicaoArray);

        imprimirTabuleiro(tab);
        jogo.getJogadorAtual();
        System.out.println(testeVerificarVazio);

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

    public static boolean verificarPosicaoVazia(Character[][] tab, int[] posicao) {

            if(posicao[0] >= 0 && posicao[0] < 3) {
                if(posicao[1] >=0 && posicao[1] < 3) {
                    if(tab[posicao[0]][posicao[1]] == null) {
                        return true;
                    }
                }
        }
        return false;
    }

    public static void fazerJogada(Character[][] tab) {

    }

}

class Jogo {
    char jogador1 = 'X';
    char jogador2 = 'O';

    Character jogadorAtual = jogador1;

    // usar o jogador atual pelo scanner ("quem vai começar o jogo?")
    public void JogadorDaVez() {
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
