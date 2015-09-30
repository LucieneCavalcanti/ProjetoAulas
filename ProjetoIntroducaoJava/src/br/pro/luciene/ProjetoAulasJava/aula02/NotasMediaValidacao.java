package br.pro.luciene.ProjetoAulasJava.aula02;
import javax.swing.JOptionPane;

/**
 * @author  Luciene Cavalcanti Rodrigues
 */

public class NotasMediaValidacao {

    public static void main(String[] args) {
        float nota = 0, media = 0;
        for (int cont = 1; cont <= 4; cont++) {
            
            do{
                nota = Float.parseFloat(JOptionPane.showInputDialog(
                "Digite a nota " + cont + ":"));

            }while (nota < 0 || nota > 10);
            
            media += nota;
        }

        JOptionPane.showMessageDialog(null, "A media é: " + (media / 4));
	
    }
}
