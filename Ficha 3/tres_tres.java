import java.util.Scanner;

public class tres_tres {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite dois valores: ");

        int val1 = sc.nextInt(), val2 = sc.nextInt();
        int maior = 0, menor = 0, mdc = 0;

        sc.close();

        if(val1 > val2){
            maior = val1;
            menor = val2;
        }
        else if (val2 > val1){
            maior = val2;
            menor = val1;
        }
        else{
            mdc = val1;

            System.out.println("O MDC é: " + mdc);
        }
        while(maior%menor != 0){
            
        }        
        
    }
}
