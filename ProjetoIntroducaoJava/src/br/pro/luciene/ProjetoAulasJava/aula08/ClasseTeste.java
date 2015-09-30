/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoAulasJava.aula08;

/**
 *
 * @author Luciene
 */
public class ClasseTeste 
implements ExemploInterface{

    @Override
    public void metodoExemplo() {
        System.out.println("método exemplo em ClasseTeste");
        int x = valor;
        System.out.println("Valor:" + x);
    }

   
    
}
