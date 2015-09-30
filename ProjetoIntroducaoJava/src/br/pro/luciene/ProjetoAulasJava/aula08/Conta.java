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
public abstract class Conta implements Operacoes{
    private String nome;
    private float saldo;

    public Conta() {
    }

    public Conta(String nome, float saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    protected final void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
