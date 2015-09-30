/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.luciene.ProjetoAulasJava.aula05;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class CadastraCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean ok = true;
        Casa obj = new Casa();
        //do{
        try {
            obj.lerDados();
            ok=true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex);
            ok=false;
        }
        //}while(ok==false);
    }
}
