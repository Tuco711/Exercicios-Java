package Ficha_8;

//Pessoas DEI

class Pessoa{
    //Atributos
    protected String nome;

    //Construtores
    Pessoa(){
        nome = "Sem nome";
    }
    Pessoa(String n){
        nome = n;
    }

    //Comportamentos
    public String getNome(){
        return nome;
    }

    protected String comunica(){
        return nome + "esta a comunicar";
    }
}

class Aluno extends Pessoa{
    private String curso;
    private String numAluno;

    //Construtores
    Aluno(String nome, String numAluno, String curso){
        super(nome);
        this.numAluno = numAluno;
        this.curso = curso;
    }

    //Comportamentos
    public String missao(){
        return "aprender";
    }

    public String toString(){
        return nome + " com o numero de aluno " + numAluno + " está com a misssao de " + missao() + " no curso de " + curso;
    }
}

class Docente extends Pessoa{
    //Atributos
    private String idNum;

    //Construtores
    Docente(){

    }
    Docente(String nome, String idNum){
        super(nome);
        this.idNum = idNum;
    }

    //Comportamentos
    public String missao(){
        return "ensinar";
    }

    public String toString(){
        return nome + " com o numero de docente " + idNum + " está com a misssao de " + missao();
    }

}

public class oito_um {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao", "12345", "LECD");
        Docente docente1 = new Docente("Maria", "12345");

        System.out.println(aluno1.toString());
        System.out.println(docente1.toString());
    }
}
