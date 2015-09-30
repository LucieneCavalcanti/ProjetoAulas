package br.pro.luciene.ProjetoAulasJava.aula04;
/**
 @author Luciene Cavalcanti */
public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario() {
        super();
        cargo = new String();
    }
    public Funcionario(int id, String nome, String cargo) {
        super(id, nome);
        this.cargo = cargo;
    } 
}
