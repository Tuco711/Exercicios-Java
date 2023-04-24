package Ficha_7;

class Angulo{
    //Atributos
    private double graus;

    //Construtores
    Angulo(){
        
    }
    Angulo(double angle){
        graus = angle;
    }

    //Comportamentos
    public double getAngle(){
        return graus;
    }

    public void setAngle(double angle){
        graus = angle;
    }

    public double radAngle(double graus){
        return Math.toRadians(graus);
    }

    public boolean equalsAngle(Angulo angle1){
        return (graus == angle1.getAngle());
    }

    public double calcSen(){
        return Math.sin(graus);
    }

    public double calcCos(){
        return Math.cos(graus);
    }

    public  double calcTg(){
        return Math.tan(graus);
    }

    public String presentAng(){
        return "É um angulo de " + graus + " graus";
    }
    
    public void somaAng(Angulo angulo1){
        graus = graus + angulo1.getAngle();
    }
}

public class sete_dois {
    public static void main(String[] args){
        Angulo a = new Angulo(180);
        Angulo b = new Angulo(90);

        a.somaAng(b);
        System.out.println(a.getAngle());
        
    }
}
