package br.pro.luciene.ProjetoAulasJava.aula08;

// Exemplo de uso de uma classe com atributo e m�todo est�tico
public class ExemploUsandoMetodoEstatico {
	public static void main(String args[]) {
		// fazendo acesso ao m�todo getObjetos de forma correta
		System.out.println("Quantidade objetos = "
				+ ExemploMetodoEstatico.getObjetos());
		System.out.println("Criando um objeto");
		ExemploMetodoEstatico d = new ExemploMetodoEstatico();
		System.out.println("Quantidade de objetos criados = " + d.getObjetos());
	}
}