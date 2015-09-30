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
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class cadastra_notas2 {
    
    /** Creates a new instance of cadastra_notas */
    public cadastra_notas2() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      JOptionPane msg = new JOptionPane();
      aluno objAluno[] = new aluno[5];
      //Vector <aluno> alunos = new Vector<aluno>();
      int cont_menor2 = 0;
      int cont_maior8 = 0;
      
      try{
      for (int i=0;i<5;i++) {
          objAluno[i] = new aluno();
          for(int cont = 0;cont<4;cont++)
              //alunos.addElement(new aluno());
              objAluno[i].setNota(cont,Float.parseFloat(msg.showInputDialog(null,"Digite a nota do " + (cont+1) + "o. bimestre \ndo aluno "+(i+1)+".","Notas",3)));

          objAluno[i].calcula_media();
          msg.showMessageDialog(null, "A m�dia do aluno � : " + objAluno[i].getMedia());
          if (objAluno[i].getMedia() < 2) cont_menor2++;
          if (objAluno[i].getMedia() > 8) cont_maior8++;
      }
      }
      catch(NumberFormatException erro) {
          msg.showMessageDialog(null, "Ocorreu um erro de convers�o: \n" + erro.getLocalizedMessage());
      }
      catch(Exception erro) {
          msg.showMessageDialog(null, "Ocorreu um erro : \n" + erro.getMessage());
      }
      msg.showMessageDialog(null, "Qtde de alunos com m�dia menor que 2: " +  cont_menor2 +
                                "\nQtde de aluno com m�dia maior que 8: " + cont_maior8,"Resultado final",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
