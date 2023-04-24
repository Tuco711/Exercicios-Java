package Ficha_8;

//Coffee shop

class bebidas{
    //Atributos
    protected String nome;
    protected String temperatura;
    protected String tamanho;

    //Construtores
    bebidas(){

    }

    bebidas(String nome, String temperatura, String tamanho){
        this.nome = nome;
        this.temperatura = temperatura;
        this.tamanho = tamanho;
    }

}

class Cafe extends bebidas{
    //Construtores
    Cafe(){
        nome = "cafe";
        temperatura = "60 graus";
        tamanho = "100ml";
    }

    Cafe(String nome, String temperatura, String tamanho){
        super(nome, temperatura, tamanho);
    }

    //Comportamento
    public String toString(){
        return nome + " com temperatura " + temperatura + " e tamanho " + tamanho;
    }
}

class Expresso extends Cafe{
    //Construtores
    Expresso(){

    }

    Expresso(String size){
        super("expresso", "70", size);

        if (size.equals("pequeno")){
            tamanho = "25ml";
        }
        else if(size.equals("nomral")){
            tamanho = "35ml";
        }
        else if (size.equals("cheio")){
            tamanho = "50ml";
        }
        
    }

    public String toString(){
        return nome + " com a temperatura " + temperatura + " tamanho " + tamanho;
        
    }
}

class Leite extends bebidas{
    //Construtor
    Leite(){
        nome = "leite";
        temperatura = "55 graus";
        tamanho = "150ml";
    }

    //Comportamento
    public String toString(){
        return nome + " com temperatura " + temperatura + " e tamanho " + tamanho;
    }
}

class EspumaDeLeite extends Leite{
        //Construtor
        EspumaDeLeite(){
            nome = "Espuma de leite";
            temperatura = "60 graus";
            tamanho = "80ml";
        }
    
        //Comportamento
        public String toString(){
            return nome + " com temperatura " + temperatura + " e tamanho " + tamanho;
        }
}

class CafeComLeite extends bebidas{
    //Atributos
    private Cafe cafe = new Cafe();
    private Leite leite = new Leite();
    private EspumaDeLeite espumaDeLeite = new EspumaDeLeite();
    private Expresso expressoCheio = new Expresso("cheio");

    //Construtor
    CafeComLeite(){

    }

    //Comportamento
    public String galao(){
        return "Galao leva" + cafe.toString() + "\n" + leite.toString();
    }

    public String capuccino(){
        return "Capuccino leva: " + expressoCheio.toString() + "\n" + leite.toString() + "\n" + espumaDeLeite.toString();
    }
}

public class oito_dois {
    public static void main(String[] args) {
        CafeComLeite e1 = new CafeComLeite();
        System.out.println(e1.capuccino());
    }
}