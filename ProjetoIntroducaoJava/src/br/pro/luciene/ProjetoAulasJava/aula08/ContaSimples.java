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
public final class ContaSimples extends Conta{

    @Override
    public boolean sacar(float valor) {
        System.out.println("Sacando Conta Simples");
        if(getSaldo()>=valor) {
            setSaldo(getSaldo()-valor);
            return true; }
        else {
            return false;
        }
    }
    
}
