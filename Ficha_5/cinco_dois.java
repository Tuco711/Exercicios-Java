package Ficha_5;

import java.util.Scanner;

public class cinco_dois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tamanho do vetor:");
        final int iLen = sc.nextInt();

        System.out.println("Digite os elementos do vetor:");
        int iElem;

        //Cria o array
        int[] aNumeros; aNumeros = new int[iLen];
        

        //Cria o array com os numeros
        for (int i = 0; i < aNumeros.length; i++){
            iElem = sc.nextInt();
            aNumeros[i] = iElem;
        }

        //Verifica se o array esta ordenado ou nao e printa o resultado
        if(isCrescente(aNumeros)){
            System.out.println("É Crescente!");
        }
        else if(isDecrescente(aNumeros)){
            System.out.println("É Decrescente!");
        }
        else{
            System.out.println("Nao ta ordenado! ;( ");
        }

        sc.close();
    }

    //Funcao que verifica se o array esta ordenado cescente
    private static boolean isCrescente(int[] nums){
        for (int i = 1; i < nums.length; i++){

            //Se o elemento anterior for maior que o atual, o array nao esta ordenado
            if(nums[i-1] > nums[i]){
                return false;
            }
        }
        return true;
    }

    //Funcao que verifica se o array esta ordenado decrescente
    private static boolean isDecrescente(int[] nums){
        for (int i = 1; i < nums.length; i++){
            //Se o elemento anterior for menor que o atual, o array nao esta ordenado
            if(nums[i-1] < nums[i]){
                return false;
            }
        }
        return true;
    }
}
