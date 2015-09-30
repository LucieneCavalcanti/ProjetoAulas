package br.pro.luciene.ProjetoAulasJava.aula08;

/**
 * @author Luciene Cavalcanti Rodrigues
 */

public abstract class ExemploAbstractItem {

    public abstract void emprestar();
    public abstract void retornar();
    public abstract boolean gravar();
    public abstract int recuperar();

    public abstract class ExemploFita extends ExemploAbstractItem {

        @Override
        public void emprestar() {

        }
    }
}
