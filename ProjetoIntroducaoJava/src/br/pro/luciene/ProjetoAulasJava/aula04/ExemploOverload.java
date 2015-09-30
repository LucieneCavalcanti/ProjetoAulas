package br.pro.luciene.ProjetoAulasJava.aula04;

/**
 * @author Luciene Cavalcanti Rodrigues
 */

public class ExemploOverload {

    public static void main(String args[]) {
        System.out.println("Apresentando o conceito de overload.");
    }

    int imprimir() {
        return 0;
    }

    int imprimir(int x, float y) {
        return 0;
    }

    boolean imprimir(int x) {
        return true;
    }

    int imprimir(float x, int y) {
        return 0;
    }

    boolean imprimir(float x, int y) {
        return true;
    }

}








