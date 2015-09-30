/*
 * Fa�a um programa que receba o nome e a nota dos alunos de uma sala
 (solicite a quantidade de alunos da sala no in�cio do programa).
 * Armazene todos os dados em um vetor de objetos e ao final da digita��o mostre:
 * a) O nome do(s) aluno(s) que obtiveram a maior nota
 * b) A nota mais baixa
 * c) Quantos alunos existem na sala
 */

package br.pro.luciene.ProjetoAulasJava.aula11;

import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class ex2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float maisbaixa=10000,maiorNota=0;
        String nomes="";
        int qtde=0;
        boolean erro=false;
        int i=0,cont=0;
        //classeEx2 alunos[] = new classeEx2[5];
do {
    try {
        qtde = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de alunos"));
        if (qtde <=0) throw new Exception("Digite uma quantidade maior que zero");
        erro = false;
    }
    catch(Exception erro1) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + erro1.getMessage());
        erro = true;
    }
}while(erro);
classeEx2 alunos[]=new classeEx2[qtde];
   do {
        try {
            for (i = i; i<qtde; i++){
            alunos[i] = new classeEx2();
            if (alunos[i].getNome().equals(""))
                alunos[i].setNome(JOptionPane.showInputDialog(null, "Digite o nome do aluno " + i));
            alunos[i].setNota(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota")));
            if (alunos[i].getNota()<0 || alunos[i].getNota()>10)
                throw new Exception("Digite uma nota entre 0 e 10");
            if (maiorNota<alunos[i].getNota()){
                maiorNota = alunos[i].getNota();
                nomes = alunos[i].getNome() + ",";
            } else if (maiorNota==alunos[i].getNota()){
                nomes +=  alunos[i].getNome() + ",";
            }
            if (maisbaixa>alunos[i].getNota()){
                maisbaixa = alunos[i].getNota();
            }
            erro = false;
            cont++;
        }
        JOptionPane.showMessageDialog(null, "Nota mais alta:" + maiorNota +
                "\nAlunos: " + nomes +
                "\nNota mais baixa: " + maisbaixa +
                "\nQtde Alunos: " + qtde);
    }
    catch(Exception erro1) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + erro1.getMessage());
        erro = true;
    }
  }while(erro);
}

}
