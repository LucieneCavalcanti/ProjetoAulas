package br.pro.luciene.ProjetoAulasJava.aula02;

/**
 * @author raphaelmachadofreire
 */

public class ExemploParImpar {
    
     public static void main(String args[]) {
        int var1 = 10;
            
            // modo de uso: if (condição)
        if (var1 % 2 == 0) {
      
            // bloco de comandos do if
            System.out.println("Número é par");
        
        } else { // condição avaliada como falso
            
            // bloco de comandos do else
            System.out.println("Número é ímpar");
        
        }
    }  
}