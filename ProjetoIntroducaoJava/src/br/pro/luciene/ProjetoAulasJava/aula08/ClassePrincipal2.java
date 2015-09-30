package br.pro.luciene.ProjetoAulasJava.aula08;

public class ClassePrincipal2 {
    
    private static void mostrar(ClasseAnimal objAnimal){
        objAnimal.emitirSom();
    }
    
    public static void main(String[] args) {
        ClasseAnimal objAnimal = new ClasseAves();
        mostrar(objAnimal); //UpCasting
        
        
       
    }
    
}
