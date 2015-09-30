package br.pro.luciene.ProjetoAulasJava.aula04;

//  @author Luciene Cavalcanti Rodrigues

public class ExemploContaCorrenteEspecial extends ExemploContaCorrente {
        
    private double limite;

    public ExemploContaCorrenteEspecial
        (int agencia, int conta, String nome, double saldo, double limite) {
        
        super(agencia, conta, nome, saldo);
	this.limite = 1000;       
    }

    public void sacar(double valor) {
        System.out.println("Classe ExemploContaCorrenteEspecial, metodo sacar");
            
        if (valor <= (this.saldo + this.limite)){
           this.saldo = this.saldo - valor;   
        }
    }

    public void depositar(double valor) {
        System.out.println("Classe ExemploContaCorrenteEspecial, metodo depositar");
    }

    @Override
    public void imprimir() {
       
        // Executa o método imprimir da superclasse
        super.imprimir(); 
	
        System.out.println("Metodo imprimir da classe ExemploContaCorrenteEspecial");
        System.out.println("Limite: " + this.limite);
    }
}
