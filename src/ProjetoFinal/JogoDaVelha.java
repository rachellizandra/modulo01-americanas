package ProjetoFinal;

public class JogoDaVelha {

    public static void main(String[] args) {

        /**
         * colocar dentro do while
         * saber a vez de cada jogador
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

        imprimirTabuleiro(tab);
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
}
