import java.util.Scanner;

public class tres_quatro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um inteiro: ");
        int numero = sc.nextInt();
        int soma =  0;

        while(numero > 0){
            int val = numero%10;

            soma = soma + val;

            numero = numero/10;
        }

        System.out.println("A soma é: " + soma);

        sc.close();
    }
}
