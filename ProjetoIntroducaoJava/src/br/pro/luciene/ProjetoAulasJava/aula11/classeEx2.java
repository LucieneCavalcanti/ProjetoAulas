/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoAulasJava.aula11;

/**
 *
 * @author Luciene
 */
public class classeEx2 {
    private String nome;
    private float nota;

    public classeEx2() {
        nome = "";
        nota=0;
    }

    public classeEx2(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
