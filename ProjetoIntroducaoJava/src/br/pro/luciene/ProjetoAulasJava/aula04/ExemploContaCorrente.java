package br.pro.luciene.ProjetoAulasJava.aula04;

//  @author Luciene Cavalcanti Rodrigues

public class ExemploContaCorrente {
    
    protected int agencia;
    protected int conta;
    protected String nome;
    protected double saldo;
        
    public ExemploContaCorrente(int agencia, int conta, String nome, double saldo){
	super();
	this.agencia = agencia;
	this.conta = conta;
	this.nome = nome;
	this.saldo = saldo;		
    }

    public void sacar(double valor) {
	System.out.println("Classe ExemploContaCorrente, metodo sacar");
                
	if (valor <= this.saldo){	
            this.saldo = this.saldo - valor;
        }
    }

    public void imprimir() {
	System.out.println("Metodo imprimir da classe ExemploContaCorrente");
        System.out.println("Agencia : " + this.agencia);
	System.out.println("Conta: " + this.conta);
	System.out.println("Nome: " + this.nome);
	System.out.println("Saldo: " + this.saldo);
    }
}
