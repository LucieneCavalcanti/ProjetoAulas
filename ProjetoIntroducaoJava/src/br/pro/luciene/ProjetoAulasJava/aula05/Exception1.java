package br.pro.luciene.ProjetoAulasJava.aula05;
import javax.swing.JOptionPane;
/**
@author Luciene Cavalcanti  */
public class Exception1 {
    public static void main(String[] args) {
    int num=0;
    try {
        num = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Digite um número"));
        JOptionPane.showMessageDialog(null, 
                "O número digitado foi: " 
                + num);        }
    catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, 
                "Ocorreu um erro na digitação, "
                + "digite apenas números.",
                "Erro !",JOptionPane.ERROR_MESSAGE);        }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro: " +
                e.getMessage(),"Erro !",
                JOptionPane.ERROR_MESSAGE);      }
   }}
