package Ficha_4;

import java.util.Scanner;

public class quatro_dois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero limite");

        int limite = sc.nextInt();

        //verifica todos os numeros no intervalo {1, limite}
        for (int i= 1; i<=limite; i++){

            //Caso a função ehPrimo retorne "true", escreve o valor
            if(ehPrimo(i)){
                System.out.print(i + " 1");
            }
        }

        sc.close();
    }

    private static boolean ehPrimo(int numero){
        //Precorre todos os valores entre 2 e o numero dado
        for (int j = 2; j < numero; j++){

            //Caso seja divisivel retorna false, se não retorna true, logo é primo
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
    
}
