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
public final class ContaEspecial extends Conta{
    private float limite;

    public ContaEspecial() {
    }

    public ContaEspecial(float limite, String nome, float saldo) {
        super(nome, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    @Override
    public boolean sacar(float valor) {
        System.out.println("Sacando Conta Especial");
        if((getSaldo()+limite) >=valor) {
            setSaldo(getSaldo()-valor);
            return true; }
        else {
            return false;
        }
    }
}
