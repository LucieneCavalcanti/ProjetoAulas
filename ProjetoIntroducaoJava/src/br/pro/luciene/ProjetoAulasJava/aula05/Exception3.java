package br.pro.luciene.ProjetoAulasJava.aula05;
import javax.swing.JOptionPane;
/**
@author Luciene Cavalcanti  */
public class Exception3 {
    public static void main(String[] args) {
    float nota1=0,nota2=0,nota3=0,nota4=0,media=0;
    boolean erro=false;
    do {
    try {
        nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, 
                "Digite a nota 1"));
        if (nota1 <0 || nota1 > 10) 
            throw new Exception("Digite uma nota entre 0 e 10");
        media+=nota1;
        erro=false;           }
    catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro na digitação, "
                + "digite apenas números.",
                "Erro !",JOptionPane.ERROR_MESSAGE); 
        erro=true;         }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null,
                e.getMessage(),
                "Erro !",JOptionPane.ERROR_MESSAGE);
        erro = true;         }
}while (erro);

do {
    try {
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, 
                "Digite a nota 2"));
        if (nota2 <0 || nota2 > 10) throw new Exception();
        media+=nota2;
        erro=false;         }
    catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro na digitação, "
                + "digite apenas números.",
                "Erro !",JOptionPane.ERROR_MESSAGE);
        erro=true;         }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, 
                "Digite uma nota entre 0 e 10 !",
                "Erro !",JOptionPane.ERROR_MESSAGE);
        erro = true;         }
}while (erro);

do {
    try {
        nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, 
                "Digite a nota 3"));
        if (nota3 <0 || nota3 > 10) throw new Exception();
        media+=nota3;
        erro=false;         }
    catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro na digitação, "
                + "digite apenas números.",
                "Erro !",JOptionPane.ERROR_MESSAGE);
        erro=true;         }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, 
                "Digite uma nota entre 0 e 10 !",
                "Erro !",JOptionPane.ERROR_MESSAGE);
        erro = true;         }
}while (erro);

do {
    try {
        nota4 = Float.parseFloat(JOptionPane.showInputDialog(null, 
                "Digite a nota 4"));
        if (nota4 <0 || nota4 > 10) throw new Exception();
        media+=nota4;
        erro=false;         }
    catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro na digitação, "
                + "digite apenas números.",
                "Erro !",JOptionPane.ERROR_MESSAGE);
        erro=true;         }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, 
                "Digite uma nota entre 0 e 10 !",
                "Erro !",JOptionPane.ERROR_MESSAGE);
        erro = true;         }
    }while (erro);
    JOptionPane.showMessageDialog(null, "A média é : " + (media/4));
    }
}
