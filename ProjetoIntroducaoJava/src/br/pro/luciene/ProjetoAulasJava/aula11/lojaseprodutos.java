
import javax.swing.JOptionPane;

/*
 * Faça um programa que receba os preços de 5 produtos em 4 lojas diferentes e mostre:
 * a) A média dos preços de cada produto (nas 4 lojas)
 * b) O produto mais caro e a loja a que ele pertence
 * c) A(s) loja(s) onde a soma dos preços dos produtos for superior a R$ 2500,00
 * OBS.: O programa deve pedir o nome da loja e utilizá-lo para exibir as respostas
 */

/**
 *
 * @author Luciene
 */
public class lojaseprodutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lojas[] = new String[4];
        String respc="";
        float precos[][]=new float[4][5];
        float soma = 0, media=0, precoProdutoMaisCaro=0, somaProdutos=0;
        int produtoMaisCaro=0, lojaProdutoMaisCaro=0;

        for (int l=0;l<4;l++){
            lojas[l]= JOptionPane.showInputDialog(null, "Digite o nome da loja " + (l+1));
            for (int p=0;p<5;p++){
                precos[l][p]= Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço do produto " +
                        (p+1) + " da loja " + lojas[l]));
                if (precos[l][p] > precoProdutoMaisCaro){
                    precoProdutoMaisCaro = precos[l][p];
                    produtoMaisCaro = p;
                    lojaProdutoMaisCaro = l;
                }
                soma+=precos[l][p];
               }
            if (soma>2500)
                respc+= lojas[l] + "\n";
            soma = 0;
            media = somaProdutos/5;
            JOptionPane.showMessageDialog(null, "A média de preços é: " + media);
        }
        if (respc.length()>0)
            JOptionPane.showMessageDialog(null, "As lojas abaixo possuem a soma dos produtos maior que R$ 2.500,00:\n" +
                    respc);
        else
            JOptionPane.showMessageDialog(null, "Nenhuma das lojas possui a soma dos produtos maior que R$ 2.500,00:\n");
        JOptionPane.showMessageDialog(null, "O produto mais caro é o " + produtoMaisCaro +
                " (R$ " + precoProdutoMaisCaro + ") da loja: " + lojas[lojaProdutoMaisCaro]);

            for (int p=0;p<5;p++){
            for (int l=0;l<4;l++){
                somaProdutos+=precos[l][p];
            }
             media = somaProdutos/4;
            JOptionPane.showMessageDialog(null, "A média de preços do produto " + (p+1)
                    +"é : " + media);
        }
    }

}
