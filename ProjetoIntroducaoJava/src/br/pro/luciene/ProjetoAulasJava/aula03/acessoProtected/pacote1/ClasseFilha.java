package br.pro.luciene.ProjetoAulasJava.aula03.acessoProtected.pacote1;

/**
 * @author Luciene Cavalcanti Rodrigues
 */

public class ClasseFilha extends ClassePai{
    
    protected int idade;

    protected void metodo2(){
        System.out.println("Entrando no método 02 - Classe Filho");
    }
}
