package br.pro.luciene.ProjetoAulasJava.aula04;

/**
 * @author Luciene Cavalcanti Rodrigues
 */

public class ExemploContaThis {
       
	private int agencia = 0;
	private int conta = 0;

	public ExemploContaThis(int agencia, int conta) {
            this.agencia = agencia;
            this.conta = conta;
	}
	
	public ExemploContaThis() {
            this(0, 0);
	}
    
}
