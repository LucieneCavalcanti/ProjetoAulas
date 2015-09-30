/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.luciene.ProjetoAulasJava.aula08;

import java.sql.Date;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public final class Fisica extends Pessoa {
    private String cpf,rg;
    private Timestamp dataNascimento;
    //construtores
    public Fisica(){
        super();
        cpf="";
        rg="";
        dataNascimento=null;
    }
    public Fisica(int idPessoa,String nome,String email,
            String endereco,String numero,String bairro,
            String complemento,String cep, String uf,
            String cpf, String rg,Timestamp dataNascimento){
        super(idPessoa, nome, email, endereco, numero, 
                bairro, complemento, cep, uf);
        this.cpf=cpf;
        this.rg=rg;
        this.dataNascimento=dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Timestamp getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Timestamp dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void lerDados(){ //sobrescrita
        super.lerDados();
        rg = JOptionPane.showInputDialog("Digite o RG");
        cpf= JOptionPane.showInputDialog("Digite o CPF");
        dataNascimento = new Timestamp(Long.parseLong(JOptionPane.showInputDialog("Digite a data de nascimento")));
    }
    @Override
    public void visualizarDados(){
        JOptionPane.showMessageDialog(null, "Dados de Pessoa Jurídica:"+
            "\nidPessoa:" + getIdPessoa() +
            "\nNome:" + getNome() +
            "\nEmail:" + getEmail() +
            "\nEndereço:" + getEndereco() +
            "\nNúmero:" + getNumero() +
            "\nBairro:" + getBairro() +
            "\nComplemento:" + getComplemento() +
            "\nCEP:"+ getCep() +
            "\nUF:"+getUf() +
            "\nCPF:" + cpf +
            "\nRG: " + rg +
            "\nData Nascimento:" + dataNascimento);
    }
}
