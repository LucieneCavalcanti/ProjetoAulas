
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luciene
 */
public class notas {
    public static void main(String[] args) {
        float notas[]= new float[4];
        float soma=0, media=0, maiorMedia=0, menorMedia=0;
        int alunoMaiorMedia=0,alunoMenorMedia=0;
        for (int i=0;i<4;i++){
            notas[i]= Float.parseFloat(JOptionPane.showInputDialog("Digite a nota"));
            soma+=notas[i]; // ou media = media + notas[i]
        }
        JOptionPane.showMessageDialog(null, "Média: " + soma/4);

        float notas2[][]= new float[5][4];

        for (int a=0;a<5;a++){
            for (int n=0;n<4;n++){
                notas2[a][n]= Float.parseFloat(
                 JOptionPane.showInputDialog("Digite a nota " + (n+1) +
                 " do aluno " + (a+1)));
                soma+=notas2[a][n]; // ou media = media + notas[i]
            }
           media = soma/4;
           JOptionPane.showMessageDialog(null, "Média: " + media);
           soma = 0;
           if (maiorMedia < media){
               maiorMedia = media;
               alunoMaiorMedia = a;
           }
           if (a == 0 || menorMedia > media){
               menorMedia = media;
               alunoMenorMedia = a;
           }
           media = 0;
        }
        JOptionPane.showMessageDialog(null, "Maior Média: " + maiorMedia +
                "\nAluno: " + (alunoMaiorMedia+1) +
                "\nMenor Média: " + menorMedia +
                "\nAluno: " + (alunoMenorMedia+1));
    }
}
