/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoAulasJava.aula08;

import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class CadastrarContas {
    public static void main(String[] args) {
        int opc = 0;
        ContaEspecial CE = new ContaEspecial();
        ContaSimples CS = new ContaSimples();
        ContaAplicacao CA = new ContaAplicacao();
        do{
            try{
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite uma opção:"+
                    "\n1 - Cadastrar Conta Simples"+
                    "\n2 - Cadastrar Conta Especial"+
                    "\n3 - Cadastrar Conta Aplicação"+
                    "\n4 - Sacar Conta Simples"+
                    "\n5 - Sacar Conta Especial"+
                    "\n6 - Sacar Conta Aplicação"+
                    "\n7 - Visualizar saldo Conta Simples"+
                    "\n8 - Visualizar saldo Conta Especial"+
                    "\n9 - Visualizar saldo Conta Aplicação"+
                    "\n10 - Sair"));
            switch(opc){
                case 1:
                    CS.setNome(JOptionPane.showInputDialog("Digite o nome"));
                    CS.setSaldo(Float.parseFloat(JOptionPane.showInputDialog(
                            "Digite o saldo inicial")));
                    //fazer uma versão 'melhorada' dos cadastros utilizando a interface
                    break;
                case 2: 
                    CE.setNome(JOptionPane.showInputDialog("Digite o nome"));
                    CE.setSaldo(Float.parseFloat(JOptionPane.showInputDialog(
                            "Digite o saldo inicial")));
                    CE.setLimite(Float.parseFloat(JOptionPane.showInputDialog(
                            "Digite o limite da conta")));
                    break;
                case 3: 
                    CA.setNome(JOptionPane.showInputDialog("Digite o nome"));
                    CA.setSaldo(Float.parseFloat(JOptionPane.showInputDialog(
                            "Digite o saldo inicial")));
                    CA.setPrazo(Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite o prazo da aplicação")));
                    break;
                case 4:
                    sacar(CS); break;
                case 5:
                    sacar(CE); break;
                case 6:
                    sacar(CA); break;
                case 7:
                    verSaldo(CS); break;
                case 8:
                    verSaldo(CE); break;
                case 9:
                    verSaldo(CA); break;
                case 10: System.exit(0);
                default: throw new Exception("Opção inválida");
            }
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null, erro.getMessage());
            }
        }while(opc!=10);
    }

    private static void sacar(Operacoes Op) throws Exception{
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do saque"));
        if(Op.sacar(valor)) 
            throw new Exception("Saque realizado com sucesso");
        else
            throw new Exception("Não foi possível sacar");
    }

    private static void verSaldo(Conta Conta) {
        JOptionPane.showMessageDialog(null, Conta.getSaldo());
    }

}
