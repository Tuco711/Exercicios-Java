import java.util.Scanner;

public class doisum{
    public static void main(String[] args){
        int val1, val2, val3;
        
        System.out.println ("Digite os tres valores:");
    	Scanner sc = new Scanner(System.in);

    	val1 = sc.nextInt();
        val2 = sc.nextInt();
        val3 = sc.nextInt();

        if(val1>val2 && val1>val3){
            System.out.println("O maior valor é: " + val1);        
        }
         else if(val2>val1 && val2> val3){
            System.out.println("O maior valor é: " + val2);
        }
        else{
            System.out.println("O maior valor é: " + val3);
        }
        sc.close();
    }
}