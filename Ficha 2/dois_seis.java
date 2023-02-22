import java.util.Scanner;

public class dois_seis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Coordenadas do centro
        System.out.println("Digite as coordenadas do centro da circunferencia");
        int centerX = sc.nextInt(),
        centerY = sc.nextInt();

        //Raio
        System.out.println("Digite o raio circunferencia");
        int raio = sc.nextInt();

        //Coordenadas do ponto
        System.out.println("Digite as coordenadas do ponto");
        int pX = sc.nextInt(), pY = sc.nextInt();

        double dist = 0;

        //Calculo da distancia euclidiana
        dist = (pX - centerX)*(pX - centerX) + (pY - centerY)*(pY - centerY);
        dist = Math.sqrt(dist);

        //Comparação de distancias
        if(dist <= raio){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
        sc.close();
    }
}

