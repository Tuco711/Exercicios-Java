import java.util.Scanner;

public class tres_um {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o limite: ");
            long lim = sc.nextLong();
            int i = 1;

            for (; lim > 0; lim--){
                System.out.print(i+ " ");
                i++;
            }

            sc.close();
        }
    
    }
}
