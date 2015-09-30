package br.pro.luciene.ProjetoAulasJava.aula08;
public class ClassePrincipal3 {
    
    public static void main(String[] args) {
              
        
        ClasseAnimal objAnimal = new ClasseCaninos();
        ((ClasseCaninos)objAnimal).emitirSom();// DownCasting
    }
    
}
