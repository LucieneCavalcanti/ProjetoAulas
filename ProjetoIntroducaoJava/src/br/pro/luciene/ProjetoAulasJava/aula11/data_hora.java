/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class data_hora {


public static void main(String[] args) {
    String nome;
    int hora, minutos, segundo, dia, dia_semana, mes, ano;
    nome = JOptionPane.showInputDialog(null,"Digite seu nome", "Boas Vindas", 2);

    // Utilizando a classe Date para das as boas vindas ...
    Date data = new Date();
    hora = data.getHours();
    minutos = data.getMinutes();
    segundo = data.getSeconds();
    dia = data.getDate();
    dia_semana = data.getDay();
    mes = data.getMonth();
    ano = data.getYear();

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    DateFormat df = DateFormat.getDateInstance();
    String hoje = df.format(data);

    JOptionPane.showMessageDialog(null,"Data formatada: " + formato.format(data),"Data Atual", 3);

    JOptionPane.showMessageDialog(null,"Seja bem vindo " + nome +
    ". Hoje é dia " + dia +
    " de " + mes +
    " de " + ano +
    ".\n São: " + hora +
    ":" + minutos, "Boas Vindas", 2);

    // Utilizando a classe Calendar para das as boas vindas ...
    // http://java.sun.com/j2se/1.5.0/docs/api/java/util/Calendar.html
    Calendar data2 = Calendar.getInstance();
    hora = data2.get(Calendar.HOUR_OF_DAY);
    minutos = data2.get(Calendar.MINUTE);
    segundo = data2.get(Calendar.SECOND);
    dia = data2.get(Calendar.DAY_OF_MONTH);
    dia_semana = data2.get(Calendar.DAY_OF_WEEK);
    mes = data2.get(Calendar.MONTH);
    ano = data2.get(Calendar.YEAR);
    

    JOptionPane.showMessageDialog(null,"Seja bem vindo " + nome +
    ". Hoje é dia " + dia +
    " de " + mes +
    " de " + ano +
    ".\n São: " + hora +
    ":" + minutos, "Boas Vindas", 2);
    }

}
