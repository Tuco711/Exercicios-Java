package Ficha_6;

public class seis_oito_reverse {
    public static void main(String[] args) {
        String codNum = "123b512e42";
        String decNum = "";

        decNum = decodNum(codNum);

    }

    private static String decodNum(String cod){
        int i = 0;
        String decode = "";

        while(cod.charAt(i) != 'b'){
            decode += cod.charAt(i);
            i++;
        }

        i++;
        char num = cod.charAt(i);
        i++;

        String sRepeat = "";

        while(cod.charAt(i) != 'e'){
            sRepeat = sRepeat + cod.charAt(i);
            i++;
        }

        return decode;
    }
}