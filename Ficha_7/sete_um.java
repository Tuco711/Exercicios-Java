package Ficha_7;

class Data{
    //atributos
    int dia, mes, ano;

    //Construtores
    public Data(){

    }
    public Data(int d, int m, int a){
        dia = d;
        mes = m; 
        ano = a;
    }

    //Comportamentos
    public String dataString(){
        return dia + "/" + mes + "/" + ano;
    }
}

public class sete_um {
    public static void main(String[] args) {
        Data d = new Data(1, 1, 2000);
        System.out.println(d.dataString());
        
    }
    
}

