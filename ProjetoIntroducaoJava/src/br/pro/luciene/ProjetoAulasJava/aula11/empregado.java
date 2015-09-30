/*
 * empregado.java
 *
 * Created on 10 de Setembro de 2007, 10:56
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Administrador
 */
public class empregado {
    private static String nome; 
    private String sobrenome;
    private static int contador; // manter o número de instancias de empregado na memória
    
    /** Construtor de empregado */

    public empregado(){
    }
    
    public empregado(String nome, String sobrenome) {
        this.nome= nome;
        this.sobrenome= sobrenome;
        contador++; //incrementa a contagem estática de empregados
        System.out.println("Construtor de Empregado: " +
           nome + " " + sobrenome +". Contador:"+ contador);
    }
    
    // subtrai 1 do contador quando o gc chamar o finalize para limpar o objeto

    protected void finalize() {
        contador--; // decrementa um do contador de objetos
        System.out.println("Empregado finalizado: " + nome +" "+ sobrenome+". Contador:"+ contador);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public static int getContador() {
        return contador;
        
    }
    
    
}
