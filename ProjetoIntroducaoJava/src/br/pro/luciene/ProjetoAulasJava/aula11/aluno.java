/*
 * aluno.java
 *
 * Created on 17 de Setembro de 2007, 12:15
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoAulasJava.aula11;

/**
 *
 * @author Administrador
 */
public class aluno {
    private float notas[]=new float[4];
    private float media;
    /** Creates a new instance of aluno */
    public aluno() {
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }
    
    public void setNota(int posicao, float nota) {
        this.notas[posicao] = nota;
    }
 
    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    public void calcula_media(){
        for(float cont:notas)
            media+=cont;
        media = media /4;
    }
}
