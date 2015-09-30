package br.pro.luciene.ProjetoAulasJava.aula02;

/**
 * @author Luciene Cavalcanti Rodrigues
 */

public class ContaCorrente {
    
    int conta;
    int agencia;
    double saldo;			
    static double cpmf; 
    String nome;

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getContaCompleta(){
    String  texto = agencia + "-" + conta;
    return texto;
    }
    
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
 
}