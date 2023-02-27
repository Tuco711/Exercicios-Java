package Ficha_4;

import java.util.Scanner;

public class quatro_cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Primiero valor
        System.out.println("Digite um inteiro(2 digt):");
        int tar = sc.nextInt();
        // Convete para String
        String sTar = String.valueOf(tar);

        //Segundo valor
        System.out.println("Digite o valor (>2 digt):");
        int valor = sc.nextInt();
        // Convete para String
        String sValor = String.valueOf(valor);

        //Check se o valor tem dois digitos e é positivo
        if(0 <= tar && tar <= 99){
            
            //Verifica se o valor contei o valor target
            if(sValor.contains(sTar)){
                System.out.println("Esta contido");
            }
            else{
    
                System.out.println("Nao esta contido");
            }
        }
        else{
            System.out.println("Valor invalido");
        }
        
        sc.close();
    }

}