package br.pro.luciene.ProjetoAulasJava.aula02;
import javax.swing.JOptionPane;

/**
 * @author Luciene Cavalcanti Rodrigues
 */

public class ExemploWhileValidacao {
    
    public static void main(String[] args) {

        int opcao = 0;
        
        do {
  	opcao = Integer.parseInt(
                JOptionPane.showInputDialog("Digite uma opção:"
                        + "\n1 – Cadastrar Fornecedor"
                        + "\n2 – Cadastrar Cliente"
                        + "\n3 – Cadastrar Produto"
                        + "\n4 – Sair"));
        
        }while (opcao!=4) ;
    }
}
