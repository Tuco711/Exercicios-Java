package Ficha_5;

import java.util.Random;

//Sudoku

public class cinco_sete {
    public static void main(String[] args) {
        int[][] table = new int[9][9];

        //Inicializar o array 2D com zeros
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                table[i][j] = 0;
            }
        }
        //Preencher o array 2D com numeros aleatorios
        fillTab(table);

        //Print do array 2D
        for (int x=0; x<9; x++){
            for (int y=0; y<9; y++){
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    //Funcao que gera um numero aleatorio entre min e max
    private static int randNum(int min, int max){
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    
    }
    //Funcao que preenche o array 2D com numeros aleatorios
    private static void fillTab(int[][] arr){
        //Percorre o array pelas linhas e colunas
        for(int i =0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                //Gera um numero aleatorio entre 1 e 9
                int num = randNum(1, 9);

                //Verifica se o numero gerado é valido
                if(checkNum(arr, num, i, j)){
                    arr[i][j] = num;
                }
                else{
                    //Se o numero gerado nao for valido, coloca 0
                    arr[i][j] = 0;
                }
            }
        }
    }
    //Funcao que verifica se o numero gerado é valido
    private static boolean checkNum (int[][] arr, int num, int x, int y){
        
        //Linhas
        for (int i = 0; i < 9; i++){
            if (arr[x][i] == num){
                return false;
            }
        }

        //Colunas
        for ( int j = 0; j<9; j++){
            if (arr[j][y] == num){
                return false;
            }
        }
        return true;
    }

    
}
