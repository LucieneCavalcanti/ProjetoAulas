package br.pro.luciene.ProjetoAulasJava.aula08;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/* @author Luciene Cavalcanti Rodrigues */

public class ExemploValidacaoCampo {

    static JTextField jt = null;
    static JFormattedTextField jft = null;
    static JPasswordField jpf = null;
    static JRadioButton jr = null;
    static JPanel jp = null;
    static JComboBox jcb = null;
    static JTabbedPane jtp = null;
    static JTable jtb = null;

    public static boolean validarCampos(Component[] componentes) {
        for (Component c : componentes) {
            if (c instanceof JTextField) { 
                jt = (JTextField) c;
                
                if (jt.getText().equals("") 
                && !jt.getToolTipText().equals("")) {
                    JOptionPane.showMessageDialog(null, jt.getToolTipText(), 
                    "Validação", JOptionPane.ERROR_MESSAGE);
                    jt.requestFocus();
                    return false;
                }
            }
        }
      return true;
    }
}




































