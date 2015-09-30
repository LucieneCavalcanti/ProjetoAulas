package br.pro.luciene.ProjetoAulasJava.aula02;
import br.pro.luciene.ProjetoAulasJava.aula03.*;
import java.util.Scanner;

/**
 * @author Luciene Cavalcanti Rodrigues
 */

public class Exemplo1 {
    
    public static void main(String[] args) {
        
        int numero = 0;
        
        System.out.println("Digite um número: ");
        
        Scanner e = new Scanner(System.in);
        numero = e.nextInt();
    System.out.println("O número digitado foi: " + numero);
    }
    
}