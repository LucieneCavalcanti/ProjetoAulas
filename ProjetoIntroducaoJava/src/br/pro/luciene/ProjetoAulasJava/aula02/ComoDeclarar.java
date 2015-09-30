package br.pro.luciene.ProjetoAulasJava.aula02;

/**
 * @author Luciene Cavalcanti Rodrigues
 */

public class ComoDeclarar {
    
    String nome, sobrenome, titulo;
    int n1, n2;

    public void mostrarNomeCompleto() {
        System.out.println(nome + " " + sobrenome);
    }

    public int somar(int n1, int n2) {
        return n1 + n2;
    }

    private float calcularJuros(float valor, float taxa) {
        return valor * taxa / 100;
    }

    public String getTitulo() {
        return titulo;
    }

}
