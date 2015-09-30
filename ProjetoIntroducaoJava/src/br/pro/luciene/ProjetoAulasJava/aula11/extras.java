/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class extras {
    public static String pegadata(){
        Date data = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat df = DateFormat.getDateInstance();
        String hoje = df.format(data);
        return hoje;
        
    }
    public static boolean validarCep(String cep){
        if(cep.length()!=9) return false;
        else if(cep.charAt(5)=='-') return true;
        else return false;
    }
}
