package br.pro.luciene.ProjetoAulasJava.aula05;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/**
@author Luciene Cavalcanti  */
public class ExemploTryWithResources {
    public static void main(String[] args) throws IOException {
         String nome="Log.txt";
         String dado="Data:" + new java.util.Date();
        try (FileOutputStream fos = new FileOutputStream(new File(nome), true);)
        {
            fos.write(dado.getBytes());   
        } catch (IOException ex) 
        {
            System.err.println("ERRO" + ex.getMessage());
        }
    }
}
