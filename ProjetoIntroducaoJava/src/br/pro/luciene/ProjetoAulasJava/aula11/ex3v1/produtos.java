/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ex3v1;

import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class produtos {
    double produtos[][];
    int linhas;
    int colunas;

    public produtos(int linhas, int colunas){
        this.linhas = linhas;
        this.colunas = colunas;
        produtos = new double [linhas][colunas];
    }
    public void setPreco(int codproduto, int loja, double preco){
        produtos[codproduto][loja] = preco;
    }
    public void calcula_media(){
        double media = 0;
        for(int i=0; i < linhas; i++) {
            media = 0;
            for (int j=0; j< colunas; j++)
                media+=produtos[i][j]; 
        JOptionPane.showMessageDialog(null, "A media do produto " + (i+1) + " é: " + (media/3));
    } }
}
