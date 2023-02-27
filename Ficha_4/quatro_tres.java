package Ficha_4;

import java.util.Scanner;

public class quatro_tres {
    public static void main(String[] args){

        //Recebe os valores das fraçoes
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

        //Verifica se os denominadores são iguais ou não, para definir o denominador final
        if(denominador1 != denominador2){
            //Se forem diferentes o denominador final é o mmc entre os dois
            denominadorFinal = mmc(denominador1, denominador2);
        }
        //Se forem iguais é um deles
        else{denominadorFinal = denominador1;}
        
        //Numerador final através do calculo do mmc feito e soma de frações
        numeradorFinal = (denominadorFinal/denominador1)*numerador1 + (denominadorFinal/denominador2)*numerador2;

        System.out.println(numeradorFinal + "/" + denominadorFinal);

        sc.close();
    }

    //Calculo de MMC
    private static int mmc(int num1, int num2){
        int maior, menor;
        
        //Descobre qual o maior e qual o menor
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

        //Eqnaun to resto da divisao deles nao for 0
        while(maior%menor != 0){
            //Multiplica o maior por dois
            maior = maior*2;
        }

        //Quando a condição acabar o maior será o Minimo multiplo comum
        return maior;
    }
}
