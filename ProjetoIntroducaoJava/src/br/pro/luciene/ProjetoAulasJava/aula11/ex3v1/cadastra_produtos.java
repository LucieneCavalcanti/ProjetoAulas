
3 – Faça um programa que receba os preços de 5 produtos em cada uma das 3 lojas,
calcule e mostre a média do preço de cada produto (entre as 3 lojas).
Ao final o programa deverá mostrar qual é o produto mais caro e o mais barato.

package ex3v1;

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
        
        float produtoLoja [][] = new float[5][3];
        
        for(int linha=0;linha<5;linha++){
            for(int coluna=0;coluna<3;coluna++){
                do{
                    try{
                        produtoLoja[linha][coluna] = Float.parseFloat(JOptionPane.
                            showInputDialog("Digite o preço do produto " + (linha+1) + 
                            " da loja " + (coluna+1)));
                    }catch(Exception erro){
                        JOptionPane.showMessageDialog(null, erro.getMessage());
                    }
                }while(produtoLoja[linha][coluna]<=0);  
            }                  
        }
        float media=0;
        for(int produto=0;produto<5;produto++){
            media=0;
            for(int loja=0;loja<3;loja++){
                media+=produtoLoja[produto][loja];
            }
            JOptionPane.showMessageDialog(null, "Média do produto " + produto +
                    " é :" + media/3);
        }
        
        
        
        
//        produtos objP = new produtos(5,3);
//        for(int i=0; i < 5; i++) {
//            for (int j=0; j< 3; j++)
//                objP.setPreco(i, j, Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto " + (i+1) + " da loja " + (j+1) + ":")));
//        }
//
//        objP.calcula_media();
    }

}
