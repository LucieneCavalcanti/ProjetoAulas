package br.pro.luciene.ProjetoAulasJava.aula08;

public class ClassePrincipal {
    final static int TAM_VETOR = 4;
    
    public void executarVetor(ClasseAnimal[] p_objAnimal) {
        for (int i = 0; i < TAM_VETOR; i++) {
                p_objAnimal[i].emitirSom();
        }
    }
    
    public static void main(String[] args) {
        ClassePrincipal Obj = new ClassePrincipal();
            
            ClasseAnimal objAnimal[] = new ClasseAnimal[TAM_VETOR];
            
                objAnimal[0] = new ClasseAnimal();
		objAnimal[1] = new ClasseFelinos();
		objAnimal[2] = new ClasseCaninos();
		objAnimal[3] = new ClasseAves();
		
            Obj.executarVetor(objAnimal);
    }
}
