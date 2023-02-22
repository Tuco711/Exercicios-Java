import java.util.Scanner;

public class tres_dois {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o inteiro: ");

        int i = 0, num = sc.nextInt();
        sc.close();
        
        for(; i <= 100; i++){
            if(i%num == 0){
                System.out.print(i + " ");
            }
        }

    }
}
