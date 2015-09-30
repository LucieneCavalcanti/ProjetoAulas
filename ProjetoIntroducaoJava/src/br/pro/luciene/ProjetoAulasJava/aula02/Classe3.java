/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoAulasJava.aula02;

import java.util.Scanner;

/**
 *
 * @author Luciene
 */
public class Classe3 {
    public static void main(String[] args) {
        int n=0;
        //similar ao C, utilizando entrada de dados em tela caractere (tipo DOS)
        System.out.println("Digite um número:");
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();
        System.out.println("O número digitado foi:"+ n);
    }
}
