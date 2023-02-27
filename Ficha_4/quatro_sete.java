package Ficha_4;

import java.util.Scanner;

public class quatro_sete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de quatro digitos:");

        int iVal = sc.nextInt();
        String sVal = String.valueOf(iVal);

        if(999< iVal && iVal < 10000){
            for(int i = 9; i> 0; i--){
                for(int n = 0; n<4; n++){

                    char Alg = sVal.charAt(n);
                    int iAlg = Character.getNumericValue(Alg);
    
                    if(i<= iAlg){
                        System.out.print("*");
                    }
                    else{
                        System.out.print("-");
                    }
                }
                System.out.print("\n");
            }
        }

        sc.close();
    }
}
