package br.pro.luciene.ProjetoAulasJava.aula02;
import javax.swing.JOptionPane;

/**
 * @author Luciene Cavalcanti Rodrigues
 */
public class ExemploSwitchMenu {
    
    public static void main(String[] args)  {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
           "Digite uma opção: " +
                "\n1 – Cadastrar Fornecedor" +
                "\n2 – Cadastrar Cliente" + 
                "\n3 – Cadastrar Produto" + 
                "\n4 – Sair"));
            
        switch (opcao) {
            case 1: cadastraFornecedor(); break;
            case 2: cadastraCliente(); break;
            case 3: cadastraProduto(); break;
            case 4: System.exit(0);
	    default: System.out.println("Opção inválida");
        }
    }
//  }    
        
        
        
        
        
    private static void cadastraFornecedor() {
      }

    private static void cadastraCliente() {
    }

    private static void cadastraProduto() {
    }




}




