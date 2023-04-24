package Ficha_6;

import java.util.Scanner;

//Apenas palavras com duas letras desejadas
public class seis_sete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Inicia a frase e poe em lowercase
        System.out.println("Introduza uma frase: ");
        String frase = sc.nextLine();
        frase = frase.toLowerCase();

        //Input da letra
        System.out.println("Introduza uma letra: ");
        char letra; letra = sc.nextLine().charAt(0);
              
        //Divide a frase por palavras
        String[] splitFrase = frase.split(" ");

        //Verifica se a palavra de indice i tem duas letras desejadas
        for (int i = 0; i < splitFrase.length; i++){
            if(doubleLetter(splitFrase[i], letra)){
                System.out.print(splitFrase[i] + " ");
            }
        }

        sc.close();
    }

    //Verifica se a palavra tem duas letras desejadas
    private static boolean doubleLetter(String sWord, char cLetter){
        int i = 0;
        int count = 0;

        while(i < sWord.length()){
            if(sWord.charAt(i) == cLetter){
                count++;
            }
            i++;
        }
    
        if(count >= 2){
            return true;
        }
        else{
            return false;
        }
    }
}