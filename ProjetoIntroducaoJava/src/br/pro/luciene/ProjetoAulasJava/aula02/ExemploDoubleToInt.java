package br.pro.luciene.ProjetoAulasJava.aula02;

/**
 * @author Luciene Cavalcanti Rodrigues
 */

public class ExemploDoubleToInt {

    public static void main(String[] args) {

        // Primeira Situação
        int a = 1;
        double b = 2;
        int c = 0;

        c = a + (int) b;
        System.out.println("Resultado é = " + c);
        
        //Segunda Situação
        b = 3.1415;
        c = a + (int)b;
        
        System.out.println("Resultado é = " + c);
    }
}
