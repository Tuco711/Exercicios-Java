import java.util.Scanner;

public class Dois_cinco {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro par ordenado");
        int x1 = sc.nextInt(), y1 = sc.nextInt();

        System.out.println("Digite o primeiro par ordenado");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        System.out.println("Digite o primeiro par ordenado");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        System.out.println("Digite o primeiro par ordenado");
        int x4 = sc.nextInt(), y4 = sc.nextInt();


        if (x1 == x2 && x4 == x3){
            if(y1 == y4 && y2 == y3){
                System.out.println("E um quadrado");
            }
        }    
        else{
            System.out.println("Não pode ser quadrado");
        }
        sc.close();
    }
}
