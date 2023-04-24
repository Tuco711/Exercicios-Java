package Ficha_6;

import java.util.Scanner;

//Numero de ocorrencia das palafras na frase
public class seis_seis_certo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pega os dados e trata-os
        System.out.println("Introduza uma frase: ");
        String frase = sc.nextLine();
        frase = frase.toLowerCase();

        //Separa a frase em palavras
        String[] splitFrase = frase.split(" ");

        for (int i = 0; splitFrase.length > i; i++){
            System.out.println(splitFrase[i] + "-" + splitFrase[i].length());
        }

        sc.close();
    }
}
