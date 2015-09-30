/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ex3v2;

import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class produtos {
    double produtos[];

    public produtos(){
        produtos = new double [3];
    }
    public void setPreco(int loja, double preco){
        produtos[loja] = preco;
    }
    public void calcula_media(){
        double media = 0;
        for (int j=0; j< 3; j++)
           media+=produtos[j]; 
        JOptionPane.showMessageDialog(null, "A media do produto é: " + (media/3));
    } 
}
