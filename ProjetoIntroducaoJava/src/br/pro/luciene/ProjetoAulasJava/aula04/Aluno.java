package br.pro.luciene.ProjetoAulasJava.aula04;
/**
 @author Luciene Cavalcanti */
public class Aluno extends Pessoa {
    private String curso;

    public Aluno() {
        super();
        curso = new String();
    }
    public Aluno(int id, String nome, String curso) {
        super(id, nome);
        this.curso = curso;
    } 
}
