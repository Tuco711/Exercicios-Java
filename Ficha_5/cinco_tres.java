package Ficha_5;


import java.util.Scanner;

public class cinco_tres {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int iElem1; int iElem2;

        System.out.println("Digite tamanho dos vetores:");
        final int iLen = sc.nextInt();

        System.out.println("Digite os elementos do primeiro vetor:");

        //Crias o arrays
        int[] aNumeros; aNumeros = new int[iLen];

        int[] aNumeros2; aNumeros2 = new int[iLen];
        
        //Cria o array 1 com os numeros
        for (int i = 0; i < aNumeros.length; i++){
            iElem1 = sc.nextInt();
            aNumeros[i] = iElem1;
        }
        
        System.out.println("Digite os elementos do segundo vetor:");
        
        //Cria o array 2 com os numeros
        for (int i = 0; i < aNumeros2.length; i++){
            iElem2 = sc.nextInt();
            aNumeros2[i] = iElem2;
        }

        int[] invArray = invArray(aNumeros2);
        
        //Printa o array
        for (int i = 0; i < aNumeros.length; i++){

            System.out.print(invArray[i] + " ");
       
        }

        
        sc.close();
    }

    //Funcao que inverte o array
    private static int[] invArray(int[] arr){
        int[] newArr = new int[arr.length];

        //copia o array para o novo array
        for(int i = 0; i < arr.length; i++){
            int cout = arr.length -i -1;


            //System.out.printf("NewArr[%d] = arr[%d] | %d = %d\n",i,cout,newArr[i],arr[cout]);
            newArr[i] = arr[cout];
            
        }
        return newArr;
    }
}

