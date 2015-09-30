package br.pro.luciene.ProjetoAulasJava.aula03;
import javax.swing.JOptionPane;

/**
 * @author Luciene Cavalcanti Rodrigues
 */

public class Exemplo2 {

    public static void main(String[] args) {
       
        int numero = 0;
        
        String aux = JOptionPane.showInputDialog("Digite um número: ");
        numero = Integer.parseInt(aux);
    
    }

}