package br.pro.luciene.ProjetoAulasJava.aula02;
/*
@author Luciene Cavalcanti Rodrigues
 */
public class ConversoesTiposPrimitivos {
    public static void main(String[] args) {
        int valorInteiro=2;
        float valorFloat=3.1f;
        double valorDouble=4.55;
        char  a = 'a';
        int   b = 'b';
        float c = 100;
        char d = 250;
        System.out.println("Inteiro:"+valorInteiro);
        System.out.println("Float:"+valorFloat);
        System.out.println("Double:"+valorDouble);
        System.out.println("Variável a:"+a);
        System.out.println("Variável b:"+b);
        System.out.println("Variável c:"+c);
        System.out.println("Variável d:" +d);
        if(2>10){
            
        }
        if(3<10){
            
        }
        String x = "asfasf";
String y = "asdfasfd";

        //Operações
        int somaInteira = valorInteiro + (int)valorFloat;
        float somaFloat = valorInteiro + valorFloat;
        double somaDouble = (double)valorInteiro + valorDouble;
        int divisao = valorInteiro/3;
        System.out.println("Soma Inteira:"+somaInteira);
        System.out.println("Soma Float:"+somaFloat);
        System.out.println("Soma Double:"+somaDouble);
        System.out.println("Divisão:"+divisao);
    }
}






