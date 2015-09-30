/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.luciene.ProjetoAulasJava.aula05;

import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class Casa {
    private String endereco;
    private String proprietario;
    private int numero;
    
//    public void lerDados() throws Exception {
//        endereco = JOptionPane.showInputDialog(null, "Digite o endere�o", "Casa", JOptionPane.QUESTION_MESSAGE);
//        proprietario = JOptionPane.showInputDialog(null, "Digite o propriet�rio", "Casa", JOptionPane.QUESTION_MESSAGE);
//        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n�mero", "Casa", JOptionPane.QUESTION_MESSAGE));
//    }
    public void lerDados()  {
        endereco = JOptionPane.showInputDialog(null, "Digite o endereço", "Casa", JOptionPane.QUESTION_MESSAGE);
        proprietario = JOptionPane.showInputDialog(null, "Digite o proprietário", "Casa", JOptionPane.QUESTION_MESSAGE);
        do{
        try{
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n�mero", "Casa", JOptionPane.QUESTION_MESSAGE));
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro:" + erro.getMessage());
        }
        }while(numero==0);
    }
}
