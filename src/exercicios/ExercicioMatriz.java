package exercicios;

public class ExercicioMatriz {

    public static void main(String[] args) {

        Character[][] mat = new Character[3][3];
        mat[0][0] = 'X';

        imprimir(mat);

        moverParaDireita(mat);
        moverParaDireita(mat);
        moverParaDireita(mat);

        imprimir(mat);

        // [_, _, _]
        // [X, _, _]
        // [_, _, _]

    }

    public static void imprimir(Character[][] mat){
        System.out.println();

        for(int indiceLinha =0; indiceLinha < mat.length; indiceLinha++){
            Character[] linha = mat[indiceLinha];
            System.out.print("[ ");

            for(int indiceColuna =0; indiceColuna < mat[indiceLinha].length; indiceColuna++){
                Character elemento = mat[indiceLinha][indiceColuna];

                if(elemento == null){
                    System.out.print("_");
                }else{
                    System.out.print(elemento);
                }
                //se o indice da coluna for igual a linha
                int ultimaPosicaoColuna = linha.length-1;

                if(indiceColuna == ultimaPosicaoColuna) {
                    System.out.print(" ]");
                }else{
                    System.out.print(" , ");
                }
            }
            System.out.println();
        }
    }

    public static void moverParaDireita(Character[][] mat){
        int[] posicao = encontrar(mat);

        int linha = posicao[0];
        int coluna = posicao[1];

        // quando o X chegar no final da ultima linha, mover para coluna abaixo
        if(coluna == mat[linha].length - 1) {
            moverParaBaixoEComeco(mat, linha);
        } else { // se não, continuar percorrendo a proxima coluna e deixar a anterior vazia
            mat[linha][coluna + 1] = mat[linha][coluna];
            mat[linha][coluna] = null;
        }
    }

    public static int[] encontrar(Character[][] mat){

        int linha = 0;
        int coluna = 0;

        encontrouX: for ( ; linha < mat.length; linha++) {
            for( ; coluna < mat[linha].length; coluna++) {
                if(mat[linha][coluna] != null) {
                    break encontrouX;
                }
            }
        }
        return new int[] {linha, coluna};
    }

    private static void moverParaBaixoEComeco(Character[][] mat, int linha){
        int ultimaColunaDaMatriz = mat[linha].length - 1;

        mat[linha][ultimaColunaDaMatriz] = null;
        mat[linha+1][0] = 'X';
    }
}