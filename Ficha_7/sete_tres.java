package Ficha_7;

class Fracao{
    //Atributos
    private int numerador;
    private int denominador;

    //Construtores
    Fracao(){
       
    }
    Fracao(int num, int den){
        numerador = num;
        denominador = den;
    }

    //Comportamentos
    public int getNum(){
        return numerador;
    }

    public int getDen(){
        return denominador;
    }

    public void setNum(int num){
        numerador = num;
    }

    public void setDen(int den){
        denominador = den;
    }

    public boolean equalsFracao(Fracao fracao1){
        return (numerador == fracao1.getNum() && denominador == fracao1.getDen());
    }

    public void somaFracao(Fracao fracao1){
        numerador = numerador + fracao1.getNum();
        denominador = denominador + fracao1.getDen();
    }

    public void subtraiFracao(Fracao fracao1){
        numerador = numerador - fracao1.getNum();
        denominador = denominador - fracao1.getDen();
    }

    public void multiplicaFracao(Fracao fracao1){
        numerador = numerador * fracao1.getNum();
        denominador = denominador * fracao1.getDen();
    }

    public void divideFracao(Fracao fracao1){
        numerador = numerador / fracao1.getNum();
        denominador = denominador / fracao1.getDen();
    }

    public String presentFracao(){
        return "É uma fração de " + numerador + "/" + denominador;
    }

}

public class sete_tres {
    public static void main(String[] args) {
        Fracao a = new Fracao(1, 2);
        Fracao b = new Fracao(3, 4);

        a.multiplicaFracao(b);
        System.out.println(a.getNum() + "/" + a.getDen());
    }
}
