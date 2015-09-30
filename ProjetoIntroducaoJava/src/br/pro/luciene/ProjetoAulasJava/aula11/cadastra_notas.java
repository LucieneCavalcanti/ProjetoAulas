/*
 * cadastra_notas.java
 *
 * Created on 17 de Setembro de 2007, 12:16
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoAulasJava.aula11;

import br.pro.luciene.ProjetoAulasJava.aula11.aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class cadastra_notas {
    
    /** Creates a new instance of cadastra_notas */
    public cadastra_notas() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      JOptionPane msg = new JOptionPane();
      aluno objAluno[] = new aluno[5];
      
      try{
        for(int a = 0; a<5; a++) { //alunos
            objAluno[a] = new aluno();
            for(int cont =0;cont<4;cont++){ //notas
              objAluno[a].setNota(cont,Float.parseFloat(msg.showInputDialog(null,"Digite a nota do " + (cont+1) + "o. bimestre.","Notas",3)));
            }
              objAluno[a].calcula_media();
              msg.showMessageDialog(null, "A m�dia do aluno � : " + objAluno[a].getMedia());
        }
      }
      catch(NumberFormatException erro) {
          msg.showMessageDialog(null, "Ocorreu um erro de convers�o: \n" + erro.getLocalizedMessage());
      
      }
      catch(Exception erro) {
          msg.showMessageDialog(null, "Ocorreu um erro : \n" + erro.getMessage());
      }
      
    }
    
}
