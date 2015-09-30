package br.pro.luciene.ProjetoAulasJava.aula08;

// Exemplo de acesso a m�todos est�ticos
public class ExemploMetodoEstatico {
	// atributo est�tico. Vis�vel para todos os outros objetos
	private static int objetos = 0;

	// o m�todo ExemploMetodoEstatico incrementa o atributo est�tico objetos
	public ExemploMetodoEstatico() {
		objetos++;
	}

	// m�todo est�tico
	public static int getObjetos() {
		return objetos;
	}
}