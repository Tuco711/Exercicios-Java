package Ficha_9;
//Animais
class Animal{
    //Atributos
    protected String especie;
    protected String id;

    //Construtores
    Animal(){

    }

    Animal(String especie, String id){
        this.especie = especie;
        this.id = id;
    }

    //Comportamento

    public void desloca(){
        System.out.println("O animal desloca-se");
    }
}

class Mamifero extends Animal{
    //Construtores
    Mamifero(){

    }

    Mamifero(String especie, String id){
        this.especie = especie;
        this.id = id;
    }

    //Comportamento
    public void desloca(){
        System.out.println("O mamifero " + especie + " esta andando");
    }
}

class Ave extends Animal{
    //Construtores
    Ave(){

    }

    Ave(String especie, String id){
        this.especie = especie;
        this.id = id;
    }

    //Comportamento
    public void desloca(){
        System.out.println("A ave " + especie + " esta voando");
    }
}

class Reptil extends Animal{
    //Construtores
    Reptil(){

    }

    Reptil(String especie, String id){
        this.especie = especie;
        this.id = id;
    }

    //Comportamento
    public void desloca(){
        System.out.println("O reptil " + especie + " esta rastejando");
    }
}

class Peixe extends Animal{
    //Construtores
    Peixe(){

    }

    Peixe(String especie, String id){
        this.especie = especie;
        this.id = id;
    }

    //Comportamento
    public void desloca(){
        System.out.println("O peixe " + especie + " esta voando");
    }
}

public class nove_um {
    public static void main(String[] args) {
        Peixe fish = new Peixe();
        fish.desloca();
    }
}
