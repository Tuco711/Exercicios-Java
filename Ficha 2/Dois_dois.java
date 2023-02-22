import java.util.Scanner;

public class Dois_dois {
    public static void main(String[] args){
        System.out.println("Digite dois valores:");
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt(),
        val2 = sc.nextInt();

        if ( (val1 % val2) == 0){
            System.out.println(val1 + " é multiplo de " + val2);
        }
        else{System.out.println("Nao sao multiplos");
        }
        sc.close();
    }
}
