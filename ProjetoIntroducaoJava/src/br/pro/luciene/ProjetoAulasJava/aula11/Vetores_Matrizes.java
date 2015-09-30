/*
 * Vetores_Matrizes.java
 *
 * Created on 10 de Setembro de 2007, 11:30
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Vetores_Matrizes {
    
    /** Creates a new instance of Vetores_Matrizes */
    public Vetores_Matrizes() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       /* int teste = 3;
        int array[]; //declaração de um vetor
        array = new int[5]; // cria o espaço para o vetor
        System.out.println("Índice    Valor");
        for(int cont=0;cont<array.length;cont++){
            System.out.println(cont + "  " + array[cont]);
        }
        
        System.out.println("*** Utilizando for controlado por contador ***");
        int n[]={10,20,30,40,21,23,88,36,45,11,23,44,556};


        for(int cont=0;cont<n.length;cont++){
            System.out.println(cont + "  " + n[cont]);
        }
        int cont1=0;
        while(cont1<n.length){
            System.out.println(cont1 + "  " + n[cont1]);
            cont1++;
        }
        
        //for aprimorado
        System.out.println("*** Utilizando for aprimorado ***");
        for(int cont:n){
            System.out.println(cont);
        }
        for(int cont:array){
            System.out.println(cont);
        }
        
        System.out.println("*** Utilizando a chamada de um método (passagem de parâmetros) ***");
        exibir_array(n);
        for(int i=0;i<array.length;i++){
           array[i]= Integer.parseInt(JOptionPane.showInputDialog(null,
                   "Digite um número:", "Atenção", JOptionPane.QUESTION_MESSAGE));
        }
        System.out.println("*** Modificando um vetor (passagem de parâmetros) ***");
        exibir_array(n); // {10,20,30,40,21,23,88,36,45};
        modifica_array(n);
        exibir_array(n); // ??
        
        
        int x = 200;
        
        modifica_array(x);
        System.out.println(x); // 200 ou 10 ?
        
        
        System.out.println("*** Modificando um elemento do vetor (passagem de parâmetros) ***");
        System.out.println("Elemento [3]: " + n[3]); //40
        modifica_elemento(n[3]);
        System.out.println("Elemento [3]: " + n[3]); // ?
        //modifica_elemento(2,4);
        
        // acessar um método que recebe uma quantidade indefinida de parâmetros
        System.out.println("*** Executando um método que pode receber vários parâmetros ***");
        varios_argumentos(2,3,3,4,5,6,7,8,9,0,22,22,33);
        varios_argumentos(2,3,4,5,6,7,8,9,9,2,3,4,5,6,7,12,3,4,8,9,0,1,2,3,4,5,6,7,8,9,9);
        varios_argumentos(2,3,10,20,30,1000,2,3,10,20,30,1000);
        varios_argumentos(1);
        varios_argumentos(1,2,4,5,7,0,9);
        varios_argumentos(n);
        double[] c1, c2;
        double c3[],c4;
        
        final int tamanho=7;
        
      
        c4=25;
        JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", JOptionPane.ERROR_MESSAGE);
        
        String semana[] = new String[tamanho];
        
        int m[][]={ 
            {10,20,30},
            {0,30,40},
            {50,2,60}};
        
        int m2[][]={ 
            {10,20,30,33,77},
            {0,30},
            {50,2,9,60}};
        
        int mm[][]=new int[3][2];
//        mm[1][4]=34;
//        mm[3][5]=90;
//    
        
        */
        //Criando um vetor de empregados
        empregado todos_empregados[]=new empregado[10];
        for(int cont = 0; cont<10; cont++)
            todos_empregados[cont] = new empregado();
        todos_empregados[0].setNome("Luciene");
        todos_empregados[0].setSobrenome("Cavalcanti");
        todos_empregados[1].setNome("Maria");
        todos_empregados[9].setNome("José");
        
        System.out.println(extras.pegadata());   
    }
    
    static void exibir_array(int vetor[]){
        for(int cont:vetor){
            System.out.println(cont);
        }
    }
    static void modifica_array(int vetor[]){
        for(int cont = 0;cont<vetor.length;cont++){
            vetor[cont]= vetor[cont]*cont;
    }}
    static void modifica_array(int vetor){
        vetor = 10;
    }

    static void modifica_elemento(int numero){
        numero = numero *2;
        System.out.println("Valor do elemento modificado: " + numero);

    }
    static void varios_argumentos(int ... numeros){ //Recurso J2SE 5.0
        int total=0;
        for(int cont:numeros){
            total+=cont;
        }
        System.out.println("Quantidade de parâmetros= " + numeros.length);
        System.out.println("Total= " + total);
    }
}
