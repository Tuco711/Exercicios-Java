package Ficha_6;

import java.util.Scanner;

//Codificação Run Length Encoding (RLE), compressão
public class seis_oito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String algarismoI = "";
        String algarismoC = "";

        //Validação do input
        do{
            System.out.println("Introduza o algarismo: ");
            algarismoI = sc.nextLine();
        }while(! validNum(algarismoI));
        
        //Codificação
        algarismoC = codifyNum(algarismoI);

        //Output
        System.out.println(algarismoI + " => " + algarismoC);

        sc.close();
    }

    //Validação do input
    private static boolean validNum(String num){
        int i=0;

        //Verificar se o input é vazio
        if(num.length() == 0){
            return false;
        }

        //Verificar se o input começa com um número
        else{
            while(i < num.length()){

                //Verificar se o input contém apenas números
                if(num.charAt(i) < '0' || num.charAt(i) > '9'){
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    //Codificação
    private static String codifyNum(String sNum){
        String sCod ="";
        int i = 0;

        //Equanto i for menor que o tamanho do input
        while(i < sNum.length()){
            int j = i+1;

            //Verificar se o número seguinte é igual ao anterior
            while(j < sNum.length() && sNum.charAt(i) == sNum.charAt(j)){
                j++;
            }

            //Se a diferença entre j e i for maior que 4, adicionar b, o número, a diferença (Comprimeto) e "e"
            if(j-i > 4){
                sCod += "b"+ sNum.charAt(i) + (j-i) + "e";
            }

            //Se a diferença entre j e i for menor ou igual a 4, adicionar o número tantas vezes como a diferença
            else{
                for(int k = 0; k < j-i; k++){
                    sCod += sNum.charAt(i);
                } 
            }
            
            i = j;
        }

        return sCod;
    }
}
