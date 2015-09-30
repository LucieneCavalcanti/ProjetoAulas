/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.luciene.ProjetoAulasJava.aula02;

/**
 *
 * @author raphaelmachadofreire
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String ("Gustavo");
        String res,res2;
        
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
        
        
        res2 = (nome1==nome3)?"igual":"diferente";
        System.out.println(res2);
    }
    
}
