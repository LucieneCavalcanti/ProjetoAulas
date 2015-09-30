/*
 * Fa�a um programa que receba o c�digo e o pre�o de 10 produtos, ao final mostre:
 * a m�dia dos pre�os e o c�digo do produto mais caro.
 */

package br.pro.luciene.ProjetoAulasJava.aula11;

import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class ex1 {
    public static void main(String[] args) {
        double preco[]= new double[10];
        int codigo[]= new int[10];
        double media=0, maiscaro=0;
        int cod=0,i=0;

        //####################### solu��o 1 #####################
        do{
        try{

            for (i=i;i<10; i++){
                codigo[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o c�digo do produto"));
                preco[i]=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o pre�o do produto"));
                if (maiscaro<preco[i]) {
                    maiscaro=preco[i];
                    cod = codigo[i]; }
                media+=preco[i];
            }
            JOptionPane.showMessageDialog(null, "O produto mais caro �: " + maiscaro +
                    "\nC�digo: " + cod);
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + erro.getMessage());
        }
    }while(i<10);

    //####################### solu��o 2 #####################
        boolean ok=true;
        do{
        try{

            for (i=0;i<10; i++){
                codigo[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o c�digo do produto"));
                preco[i]=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o pre�o do produto"));
                if (maiscaro<preco[i]) {
                    maiscaro=preco[i];
                    cod = codigo[i]; }
                media+=preco[i];
            }
            JOptionPane.showMessageDialog(null, "O produto mais caro �: " + maiscaro +
                    "\nC�digo: " + cod);
            ok = true;
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + erro.getMessage());
            ok=false;
        }
    }while(ok==false);

    }
}
