/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoAulasJava.aula02;

import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class Classe4 {
    public static void main(String[] args) {
        int n=0;
        //agora utilizando interface gráfica (caixa de diálogo - classe JOptionPane)
        String valor = JOptionPane.showInputDialog("Digite um número:");
        n = Integer.parseInt(valor);
        JOptionPane.showMessageDialog(null,"O número digitado foi:"+ n);
    }
}
