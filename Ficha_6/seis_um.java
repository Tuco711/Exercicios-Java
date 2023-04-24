package Ficha_6;

import java.util.Scanner;

//Palindromo?
public class seis_um {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza uma palavra: ");
        String palavra = sc.nextLine();

        //Coloca a plavra toda em minusculas e depois inverte a palavra
        palavra = palavra.toLowerCase();
        String reverse = reverseString(palavra);

        //Verifica se a palavra é igual a palavra invertida
        if (palavra.equals(reverse)){
            System.out.println("É um palindromo");
        }
        else{
            System.out.println("Não é um palindromo");
        }

        sc.close();
    }

    private static String reverseString(String s) {
        
        //Cria string vazia e vai adicionando os caracteres da string original
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }
}
