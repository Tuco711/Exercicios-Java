package Ficha_5;

import java.util.Scanner;

public class cinco_um {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tamanho do vetor:");
        final int iLen = sc.nextInt();

        System.out.println("Digite os elementos do vetor:");
        float fElem;

        //Cria o array
        float[] aNumeros; aNumeros = new float[iLen];
        int iAlunos = 0;

        //Cria o array com os numeros
        for (int i = 0; i < aNumeros.length; i++){
            fElem = sc.nextFloat();
            aNumeros[i] = fElem;
            
            iAlunos++;
        }

        
        float min = sortArray(aNumeros)[0];
        float max = sortArray(aNumeros)[1];
        float media = calcMedia(aNumeros, iAlunos);

        System.out.print(" min: " + min + " Max: " + max + " media: " + media);

        sc.close();
    }
    
    //Funcao que ordena o array e retorna o minimo e o maximo
    public static float[] sortArray(float[] tab){
        float max = 0;
        float min = 99;
        
        //Compara os elementos do array e ordena
        for (int i = tab.length -1; i >= 0; i--){
            if (tab[i] > max){
                max = tab[i];
            }
            if (tab[i] < min){
                min = tab[i];
            }
        }
        //Cria um array com o minimo e o maximo
        float[] res = {min, max};
            
        return res;
    }

    //Funcao que calcula a media
    private static float calcMedia(float[] tab, int alunos){
        float media = 0;
        int soma = 0;

        //A soma dos elementos do array
        for (int i = 0; i < alunos; i++){
            soma += tab[i];
        }
        //A media
        media = soma / alunos;
        return media;
    }
}
