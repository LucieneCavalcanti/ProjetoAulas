package br.pro.luciene.ProjetoAulasJava.aula08;
import java.util.Scanner;

/* @author Luciene Cavalcanti Rodrigues*/

//Esta classe não pode ser herdada
public final class ExemploFinal {
    
    public final double valorPi = 3.1416;
    public int raio;
    
    public static void main(String[] args) {
        (new ExemploFinal()).retornarPi();
    }
    
    //Este método não pode ser sobrescrito (override)
    public final void retornarPi(){
        
        System.out.println("Digite um valor raio: ");
        Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
        this.raio = scan.nextInt();
        System.out.println("Àrea igual: " + this.valorPi * this.raio * this.raio);
    
        //erro de compilação, devido a variável valorPI ser final
        //valorPi = 3.15; 
    }
}
