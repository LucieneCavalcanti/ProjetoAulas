package br.pro.luciene.ProjetoAulasJava.aula04;

//  @author Luciene Cavalcanti Rodrigues

public class ExemploContaPrincipal {
    
    public static void main(String[] args) {

        ExemploContaCorrente tConta;
        tConta = new ExemploContaCorrente(10, 20,"Gleibe Zanetti", 100);
	tConta.sacar(10.0);
        
	ExemploContaCorrenteEspecial tContaEsp;
        tContaEsp = new ExemploContaCorrenteEspecial(10, 20, "Carlos Xavier", 100, 900);
	tContaEsp.sacar(10.0);

	ExemploContaCorrente ref;
	ref = new ExemploContaCorrenteEspecial(10, 20, "Dennys Amauri", 100, 900);
        ref.sacar(10.0);		
            
            tContaEsp.imprimir();
            tContaEsp.depositar(90);
            tConta.imprimir(); 
            tConta.depositar(); 
            ref.depositar();
            ref.imprimir();
    }
}
 