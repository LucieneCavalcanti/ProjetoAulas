package br.pro.luciene.ProjetoAulasJava.aula08;

import javax.swing.JOptionPane;

public final class Juridica extends Pessoa {
    private String cnpj,ie;

    public Juridica() {
        super();
        cnpj="";
        ie="";
    }

    public Juridica(String cnpj, String ie, int idPessoa, String nome, String email, String endereco, String numero, String bairro, String complemento, String cep, String uf) {
        super(idPessoa, nome, email, endereco, numero, bairro, complemento, cep, uf);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
    public void lerDados(){ //sobrescrita
        super.lerDados();
        cnpj = JOptionPane.showInputDialog("Digite o cnpj");
        ie = JOptionPane.showInputDialog("Digite a Inscrição Estadual");
    }
    
//    @Override --> Tem que criar este método
//    public void visualizarDados(){
//        JOptionPane.showMessageDialog(null, "Dados de Pessoa Jurídica:"+
//            "\nidPessoa:" + getIdPessoa() +
//            "\nNome:" + getNome() +
//            "\nEmail:" + getEmail() +
//            "\nEndereço:" + getEndereco() +
//            "\nNúmero:" + getNumero() +
//            "\nBairro:" + getBairro() +
//            "\nComplemento:" + getComplemento() +
//            "\nCEP:"+ getCep() +
//            "\nUF:"+getUf() +
//            "\nCNPJ:" + cnpj +
//            "\nInscrição Estadual: " + ie);
//    }
}
