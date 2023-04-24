package Ficha_6;

import java.util.Scanner;

//Data por extenso
public class seis_quatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma data no formato DD/MM/AAAA: ");
        String data = sc.nextLine();

        //Separa a data em dia, mes e ano
        String[] dataSplit = data.split("/");

        String mes = dataSplit[1];
        //Converte o numero do mes para extenso
        switch (mes) {
            case "01":  mes = "Janeiro";
                     break;
            case "02":  mes = "Fevereiro";
                     break;
            case "03":  mes = "Março";
                     break;
            case "04":  mes = "Abril";
                     break;
            case "05":  mes = "Maio";
                     break;
            case "06":  mes = "Junho";
                     break;
            case "07":  mes = "Julho";
                     break;
            case "08":  mes = "Agosto";
                     break;
            case "09":  mes = "Stembro";
                     break;
            case "10": mes = "Outubro";
                     break;
            case "11": mes = "Novembro";
                     break;
            case "12": mes = "Dezembro";
                     break;
            default: mes = "Invalid month";
                     break;
        }
        
        System.out.println(dataSplit[0] + " de " + mes + " de " + dataSplit[2]);

        sc.close();
    }
}
