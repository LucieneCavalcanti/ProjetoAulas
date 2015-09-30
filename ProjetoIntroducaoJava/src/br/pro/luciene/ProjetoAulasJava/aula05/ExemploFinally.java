package br.pro.luciene.ProjetoAulasJava.aula05;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/**
@author Luciene Cavalcanti  */
public class ExemploFinally {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=null;
        try {
            String nome="Log.txt";
            String dado="Data:" + new java.util.Date();
            fos = new FileOutputStream(new File(nome), true);
            fos.write(dado.getBytes());
            
        } catch (IOException ex) {
            System.err.println("ERRO" + ex.getMessage());
        } finally { 
            fos.close(); }
    }
}
