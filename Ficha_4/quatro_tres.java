package Ficha_4;

import java.util.Scanner;

public class quatro_tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeradorFinal, denominadorFinal;

        System.out.print("Digite o primeiro numerador: ");
        int numerador1 = sc.nextInt();

        System.out.print("Digite o primeiro denominador: ");
        int denominador1 = sc.nextInt();

        System.out.print("Digite o segundo numerador: ");
        int numerador2 = sc.nextInt();

        System.out.print("Digite o segundo denominador: ");
        int denominador2 = sc.nextInt();

        if(denominador1 != denominador2){
            denominadorFinal = mmc(denominador1, denominador2);
        }
        else{denominadorFinal = denominador1;}
        
        numeradorFinal = (denominadorFinal/denominador1)*numerador1 + (denominadorFinal/denominador2)*numerador2;

        System.out.println(numeradorFinal + "/" + denominadorFinal);

        sc.close();
    }

    private static int mmc(int num1, int num2){
        int maior, menor;
        
        if(num1 > num2){
            maior = num1;
            menor = num2;
        }
        else if (num2 > num1){
            maior = num2;
            menor = num1;
        }
        else{
            return num1;
        }

        while(maior%menor != 0){
            maior = maior*2;
        }

        return maior;
    }
}
