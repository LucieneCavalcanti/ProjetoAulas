/*
3 – Faça um programa que receba os preços de 5 produtos em cada uma das 3 lojas (uma matriz 5 x 3, crie uma classe para armazenar estes dados), calcule e mostre a média do preço de cada produto (entre as 3 lojas). Ao final o programa deverá mostrar qual é o produto mais caro e o mais barato.
OBS.: Utilize vetor ou matriz.

 */

package ex3v2;

import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class cadastra_produtos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        produtos objP[] = new produtos[5];
        for(int i=0; i < 5; i++) {
            objP[i] = new produtos();
            for (int j=0; j< 3; j++)
                objP[i].setPreco(j, Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto " + (i+1) + " da loja " + (j+1) + ":")));
            objP[i].calcula_media();
        }
    }

}
