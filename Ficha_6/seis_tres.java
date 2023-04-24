package Ficha_6;

import java.util.Scanner;

public class seis_tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza uma palavra: ");
        String palavra = sc.nextLine();
        palavra = palavra.toLowerCase();
        String newString = "";

        //Verifica se o caracter é uma vogal e adiciona "p" no final
        for (int i = 0; palavra.length() > i; i++){
            if(isVogal(palavra.charAt(i))){
                newString += palavra.charAt(i) + "p";
            }
            else{
                newString += palavra.charAt(i);
            }
        }
        System.out.println(newString);

        sc.close();
    }

    private static boolean isVogal(char c) {
        //Verifica se o caracter é uma vogal
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
}
