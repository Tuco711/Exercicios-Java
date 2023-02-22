import java.util.Scanner;

public class dois_oito_chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de quatro dígitos: ");
        int numero = sc.nextInt();

        int[] ocorrencias = new int[10];

        // Percorre cada dígito do número e incrementa a contagem de ocorrências do dígito correspondente
        while (numero > 0) {
            int digito = numero % 10;
            ocorrencias[digito]++;
            numero /= 10;
        }

        // Imprime o resultado
        System.out.println("Número de ocorrências de cada dígito:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + ocorrencias[i]);
        }

        sc.close();
    }
}
