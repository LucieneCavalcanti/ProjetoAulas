package br.pro.luciene.ProjetoAulasJava.aula08;
//usando o comando import static 
import static javax.swing.JOptionPane;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import static java.lang.System.out;
public class ExemploImportStatic {
	public static void main(String args[]) {
            out.println(sqrt(PI));
            JOptionPane.showMessageDialog(null, "oi");
            showInputDialog(null,"teste");
            showConfirmDialog(null, UNINITIALIZED_VALUE);
	}
}

