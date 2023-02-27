package Ficha_4;

import java.util.Scanner;

//Combinações possiveis
public class quatro_um {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pega os valores
        System.out.println("Digite o primeiro valor:");
        int val1 = sc.nextInt();

        System.out.println("Digite o segundo valor:");
        int val2 = sc.nextInt();

        //Print do valor através do metodo "comb"
        System.out.println("O numero de combinacoes possiveis é " + comb(val1, val2));
        
        sc.close();
    }

    //Criação do metodo fact, fatorial
    private static long fact(int num){
        long f = 1;

        //calculo do fatorial
        for (int i=2; i<= num; i++){
            f = f*i;
        }
        return f;
    }

    //Metodo que calcula as combinações possiveis entre dois numeros com o uso do metodo fact
    private static long comb(int n, int k){
        return fact(n)/(fact(k)*fact(n-k));
    }
    
}
