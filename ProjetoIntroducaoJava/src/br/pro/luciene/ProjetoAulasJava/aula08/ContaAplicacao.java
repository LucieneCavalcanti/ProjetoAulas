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
public final class ContaAplicacao extends Conta {
    private int prazo;

    public ContaAplicacao() {
    }

    public ContaAplicacao(int prazo, String nome, float saldo) {
        super(nome, saldo);
        this.prazo = prazo;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }
    
    @Override
    public boolean sacar(float valor) {
        System.out.println("Sacando Conta Aplicação");
        if(getSaldo()>=valor && prazo<90) {
            setSaldo(getSaldo()-valor);
            return true; }
        else {
            return false;
        }
    }
}
