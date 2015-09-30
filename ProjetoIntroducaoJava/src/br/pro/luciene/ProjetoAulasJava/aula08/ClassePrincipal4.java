package br.pro.luciene.ProjetoAulasJava.aula08;
public class ClassePrincipal4 {
   
    public static void main(String[] args) {
        
        ClasseAnimal objAnimal = new ClasseCaninos();
        
        if(objAnimal instanceof ClasseCaninos)
            System.out.println("objAnimal é da ClasseCaninos");
        else
            System.out.println("objAnimal não é da ClasseCaninos");
    }
}
