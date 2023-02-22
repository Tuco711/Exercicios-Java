import java.util.Scanner;

public class Dois_tres {
    public static void main(String[] args){
        double pi = 3.14;

        System.out.println("Qual o valor do raio?");
        Scanner sc = new Scanner(System.in);
        int raio = sc.nextInt();

        System.out.println("Qual a opcao?");
        System.out.println("Opcao 1 - diametro"); 
        System.out.println("Opcao 2 - perimetro");
        System.out.println("Opcao 3 - area");

        int opc = sc.nextInt();
        
        if (opc == 1){
            int dim = 2*raio;
            System.out.println("O diametro é " + dim);
        }
        else if(opc == 2){
            double per = 2*pi*raio;
            System.out.println("O perimetro é " + per);
        } 
        else{
            double area = pi* raio*raio;
            System.out.println("A area é " + area);
        }
        sc.close();
    }
}
