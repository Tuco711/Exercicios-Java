import java.util.Scanner;

public class dois_quatro {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();


        if(nota <= 9){
            System.out.println("Nota insuficiente");
        }
        else if (nota <= 13){
            System.out.println("Nota suficiente");
        }
        else if (nota <= 16){
            System.out.println("Nota boa");
        }
        else{
            System.out.println("Nota exelente");
        }

        
        sc.close();
    }
}
