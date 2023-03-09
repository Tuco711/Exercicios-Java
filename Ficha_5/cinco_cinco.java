package Ficha_5;

import java.util.Arrays;
import java.util.Scanner;

public class cinco_cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Introduza o limite:");
        int limite = sc.nextInt();
        int[] primos = peneira(limite);
        System.out.println(Arrays.toString(primos));

        sc.close();
    }

    //Funcao que calcula os numeros primos com o metodo da peneira
    private static int[] peneira(int lim){
        boolean[] aux = new boolean[lim];

        
        for (int i = 0; i < lim; i++){
            aux[i] = true;
        }

        //Calcula os numeros primos
        for (int j=2; j<lim; j++){
            if(aux[j]){
                for (int k = j+1; k < lim; k++){
                    if(k%j == 0){
                        aux[k] = false;
                    }
                }
            }
        }
        
        //Conta o numero de primos
        int count = 0;
        for(int i = 2; i < lim; i++){

            if(aux[i]){
                count++;
            }
        }
        int[] res = new int[count];
        int j = 0;
        
        //Cria o array com os numeros primos
        for(int i = 2; i< lim; i++){

            if(aux[i]){
                res[j] = i;
                j++;
            }
        }
        return res;
    }
}