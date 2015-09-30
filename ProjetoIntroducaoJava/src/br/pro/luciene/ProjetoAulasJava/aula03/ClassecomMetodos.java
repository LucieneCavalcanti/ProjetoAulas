package br.pro.luciene.ProjetoAulasJava.aula03;

/**
 * @author Luciene Cavalcanti Rodrigues
 */

public class ClassecomMetodos {

//  Método Principal  
    public static void main(String[] args) {

        somar(2, 45);
        subtrair(5, 3);
        int x = dividir(10, 2);
        
        System.out.println("Valor da Divisão é: " + x);

    }

//  Outros Métodos  
    public static void somar(int num1, int num2) {
        System.out.println("Valor da Somatória é: " + (num1 + num2));
    }

    public static void subtrair(int num1, int num2) {
        System.out.println("Valor da Subtração é: " + (num1 - num2));
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }
    
}

