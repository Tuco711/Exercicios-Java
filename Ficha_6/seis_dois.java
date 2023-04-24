package Ficha_6;

import java.util.Scanner;

//Alfabética?
public class seis_dois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza uma palavra: ");
        String palavra = sc.nextLine();
        palavra = palavra.toLowerCase();
        
        //Verifica se a palavra é alfabética
        if (isAlphabetical(palavra)){
            System.out.println("É alfabética");
        }
        else{
            System.out.println("Não é alfabética");
        }

        sc.close();
    }

    private static boolean isAlphabetical(String s) {
        //Verifica se a palavra é alfabética
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)){
                return false;
            }
        }
        return true;
    }
}
