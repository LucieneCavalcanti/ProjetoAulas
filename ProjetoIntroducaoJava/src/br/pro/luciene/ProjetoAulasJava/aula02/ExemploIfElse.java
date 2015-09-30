package br.pro.luciene.ProjetoAulasJava.aula02;

/**
 * @author Luciene Cavalcanti Rodrigues
 */

public class ExemploIfElse {
    
    public static void main(String args[]) {
        int var1 = 10;
        int var2 = 20;
        
        // modo de uso: if (condicao)
        if (var1 > var2) {
      
            // bloco de comandos do if
            System.out.println("var1 é maior que var2");
        
        } else { // condição avaliada como falso
      
            // bloco de comandos do else
            System.out.println("var1 é menor que var2");
        }
    }   
}