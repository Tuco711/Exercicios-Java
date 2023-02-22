
import java.util.Scanner;


public class dois_sete {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do cartao (4 digt):");
        int cardNum = sc.nextInt();
        int soma;
        int val1, val2, val3, val4;

        
        
        val1 = cardNum%10;
        val2 = (cardNum/10)%10;
        val3 = (cardNum/100)%10;
        val4 = (cardNum/1000)%10;
        
        soma = val1 + val2+ val3 + val4;

        if (soma % 2 == 0){
            cardNum = cardNum*10;
            System.out.println("O novo numero é " + cardNum);
        }
        else{
            cardNum = (cardNum*10) + 1;
            System.out.println("O novo numero é " + cardNum);
        }

        sc.close();
    }
}
