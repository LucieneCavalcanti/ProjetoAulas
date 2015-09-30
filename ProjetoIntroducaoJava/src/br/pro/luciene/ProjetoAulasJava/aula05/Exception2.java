package br.pro.luciene.ProjetoAulasJava.aula05;
import javax.swing.JOptionPane;
/**
@author Luciene */
public class Exception2 {
    public static void main(String[] args) {
    int num=0;
    do{
        try {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Digite um número"));
            JOptionPane.showMessageDialog(null, 
                    "O número digitado foi: " + num); }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, 
                    "Ocorreu um erro na digitação, "
                    + "digite apenas números.","Erro !",
                    JOptionPane.ERROR_MESSAGE);}
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " 
                    + e.getMessage(),"Erro !",
                    JOptionPane.ERROR_MESSAGE);}
    }while (num<=0); 
  }}
