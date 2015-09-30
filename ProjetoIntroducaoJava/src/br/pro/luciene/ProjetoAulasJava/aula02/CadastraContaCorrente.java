package br.pro.luciene.ProjetoAulasJava.aula02;

/**
 * @author  Luciene Cavalcanti Rodrigues
 */

public class CadastraContaCorrente {

    int contador;

    public static void main(String args[]) {
    
        int var1 = 20;
        int var2 = 10;

        ContaCorrente obj1 = new ContaCorrente();
        obj1.setNome("Maria");
        obj1.setAgencia(0715);

        System.out.println("Variarvel1 = " + var1);
        System.out.println("Objeto1 = " + obj1.getNome());
        calculaValor(var1);
        calculaValor(obj1);
        
        System.out.println("Variarvel1 = " + var1);
        System.out.println("Objeto1 = " + obj1.getNome());
    }

    public static void calculaValor(int var1) {
        var1 = 200;
    }

    public static void calculaValor(ContaCorrente obj1) {
        obj1.setNome("José");
    }
}