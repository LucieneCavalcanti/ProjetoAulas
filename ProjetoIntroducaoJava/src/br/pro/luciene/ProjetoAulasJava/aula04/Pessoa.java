package br.pro.luciene.ProjetoAulasJava.aula04;
/**
 @author Luciene Cavalcanti  */
public class Pessoa {
    private int id;
    private String nome;

    public Pessoa() {
        id=0;
        nome=new String();
    }
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }  
}
