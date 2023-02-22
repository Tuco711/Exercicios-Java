package Ficha_4;

import java.util.Scanner;

public class quatro_um {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int val1 = sc.nextInt();

        System.out.println("Digite o segundo valor:");
        int val2 = sc.nextInt();

        System.out.println("O numero de combinacoes possiveis é " + comb(val1, val2));
        
        sc.close();
    }

    private static long fact(int num){
        long f = 1;

        for (int i=2; i<= num; i++){
            f = f*i;
        }
        return f;
    }

    private static long comb(int n, int k){
        return fact(n)/(fact(k)*fact(n-k));
    }
    
}
