package Ficha_6;

import java.util.Scanner;

//Numero de ocorrencia das palafras na frase
public class seis_seis_errado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pega os dados e trata-os
        System.out.println("Introduza uma frase: ");
        String frase = sc.nextLine();
        frase = frase.toLowerCase();

        //Separa a frase em palavras
        String[] splitFrase = frase.split(" ");

        for (int i = 0; splitFrase.length > i; i++){
            System.out.println("A palavra " + splitFrase[i] + " aparece " + countSubstring(splitFrase, splitFrase[i]) + " vezes na frase");
        }

        frase.contains(frase);
        sc.close();
    }

    private static int countSubstring(String[] splitFrase, String sub) {
        int count = 0;

        for (int i = 0; i < splitFrase.length; i++){
            if (splitFrase[i].equals(sub)){
                count++;
            }
        }
        return count;
    }
}

