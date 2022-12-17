package matrizes;

import java.sql.SQLOutput;

public class ExercicioMatriz {

    public static void main(String[] args) {

        Character[][] mat = new Character[3][3];
        mat[0][0] = 'X';

        imprimir(mat);

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
                if(indiceColuna == linha.length-1){
                    System.out.print(" ]");
                }else{
                    System.out.print(" , ");
                }
            }
            System.out.println();
        }
    }
    public static void mover(Character[][] mat){

        int swapCount= 1;

        while (swapCount > 0) {

            swapCount = 0;
            for (int col = 0; col < mat[0].length; col++) {
                for (int row = 0; row < mat.length; row++) {
                    if (mat[row][col] == 0) {
                        if( ((row-1) >= 0) && (mat[row-1][col] != 0)) {
                            //do swap
                            mat[row][col] = mat[row-1][col];
                            mat[row-1][col]= 0;
                            swapCount++;
                        }
                    }
                }
            }
        }
    }

    public static int[] encontrar(Character[][] mat){
        return new int[] {0,0};
    }

    private static void moverParaBaixoEComeco(Character[][] mat){

    }
}