/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoAulasJava.aula02;

/**
 *
 * @author Luciene
 */
public class ConversoesStrings {
    public static void main(String[] args) {
        String a="2", b="3.1", c="4.55", nome="Maria";
        int valorInteiro=Integer.parseInt(a);
        float valorFloat=Float.parseFloat(b);
        double valorDouble=Double.parseDouble(c);
        System.out.println("Strings: "+ a + " - " + b + " - " 
                + c + " - " + nome);
        System.out.println("Números: "+ valorInteiro + " - " 
                + valorFloat + " - " + valorDouble);
   
        System.out.println("Operações antes da conversão");
        System.out.println("a + b = " + (a+b));
        System.out.println("b + c = " + (b+c));
        
        System.out.println("Operações após a conversão");
        System.out.println("a + b = " + (valorInteiro+valorFloat));
        System.out.println("b + c = " + (valorFloat+valorDouble));
        
    }
}