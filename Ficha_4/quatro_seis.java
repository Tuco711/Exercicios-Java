package Ficha_4;

import java.util.Scanner;

public class quatro_seis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor (<1000):");
        int x = sc.nextInt();
        String sVal = String.valueOf(x);

        
        for(int i= 0; i<= 1000; i++){
            String sI = String.valueOf(i);
            
            if(sI.contains(sVal)){
                System.out.print(sI + " ");
            }
            
        }
        
        sc.close();
    }
}
