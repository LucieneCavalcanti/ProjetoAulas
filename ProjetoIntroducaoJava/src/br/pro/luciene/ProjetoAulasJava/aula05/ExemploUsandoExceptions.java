package br.pro.luciene.ProjetoAulasJava.aula05;
import javax.swing.JOptionPane;
/**
@author Luciene Cavalcanti  */
public class ExemploUsandoExceptions {
public static void main(String args[]) {
    ExemploUsandoExceptions obj = new ExemploUsandoExceptions();
    try {
         obj.lerNota();
    }
    catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Digite apenas numeros");
    }catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}

private void lerNota() throws Exception
{   double nota = 0.0;
    nota = Double.parseDouble(
       JOptionPane.showInputDialog(null,"Entre com uma nota: "));
    if ((nota < 0) || (nota > 10)) {
       throw new Exception("Erro na leitura dos dados");
    }
    calcularNota(nota);
}
private void calcularNota(double nota) throws Exception 
{   if (nota >= 6) { throw new Exception("Aprovado");
    } else if ((nota >= 4) && (nota < 6)) {
	throw new Exception("Exame");
    } else { throw new Exception("Reprovado"); }
}
}