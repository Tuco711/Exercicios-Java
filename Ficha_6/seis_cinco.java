package Ficha_6;

import java.util.Scanner;

//Palavra esta na frase?
public class seis_cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.println("Introduza uma frase: ");
        String frase = sc.nextLine();
        frase = frase.toLowerCase();
        String[] splitFrase = frase.split(" ");

        System.out.println("Introduza uma palavra: ");
        String palavra = sc.nextLine();
        palavra = palavra.toLowerCase();

        for(int i = 0; i < splitFrase.length; i++){
            if (isSubstring(splitFrase, palavra)){
                count++;
            }
        }

        System.out.println("A palavra " + palavra + " aparece " + count + " vezes na frase");
        sc.close();
    }

    private static boolean isSubstring(String[] splitFrase, String sub) {

        for (int i = 0; i < splitFrase.length; i++){
            if (splitFrase[i].equals(sub)){
                return true;
            }
        }
        return false;

    }
}
