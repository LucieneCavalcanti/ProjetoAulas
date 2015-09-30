
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luciene
 */
public class ClassesArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int qtdeAlunos=0;
        qtdeAlunos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de alunos"));
        String nomeAlunos[]=new String[qtdeAlunos];
        String msg1,msg2,msg3,msg4="";
        double notaAlunoOriginal[]=new double[qtdeAlunos];
        for (int aluno = 0; aluno < qtdeAlunos; aluno++){
            do {
                nomeAlunos[aluno]=JOptionPane.showInputDialog(null, "Digite o nome do aluno " + aluno);
            } while (nomeAlunos[aluno].equals(""));
            do {
            notaAlunoOriginal[aluno]=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do aluno " + nomeAlunos[aluno]));
            } while (notaAlunoOriginal[aluno]<0 || notaAlunoOriginal[aluno] > 10);
            
        }
        double notaAlunoOrdenada[]= new double[qtdeAlunos];
        System.arraycopy(notaAlunoOriginal, 0, notaAlunoOrdenada, 0, qtdeAlunos);
        Arrays.sort(notaAlunoOriginal);
        msg1 = "Nomes dos Alunos: ";
        msg2 = "Notas ordenadas: ";
        msg3 = "Notas originais: ";
        for (int aluno = 0; aluno < qtdeAlunos; aluno++){
            msg1+=nomeAlunos[aluno] +", ";
            msg2+=notaAlunoOriginal[aluno] + ", ";
            msg3+=notaAlunoOrdenada[aluno] + ",";
            if (notaAlunoOriginal[0]==notaAlunoOrdenada[aluno]){
                msg4+="\n\nAluno com menor nota: " + nomeAlunos[aluno]; }
            if (notaAlunoOriginal[qtdeAlunos-1]==notaAlunoOrdenada[aluno]){
                msg4+="\n\nAluno com maior nota: " + nomeAlunos[aluno]; }
        }
        JOptionPane.showMessageDialog(null, msg1+"\n"+msg2+"\n"+msg3+msg4,"Resultado",3);
    }

}
