package br.pro.luciene.ProjetoAulasJava.aula08;


import javax.swing.JOptionPane;

public abstract class Pessoa {
    private int idPessoa;
    private String nome, email, endereco, numero, bairro,
            complemento,cep,uf;
    //construtores
    public Pessoa(){ //construtor nulo
        idPessoa=0;
        nome="";
        email="";
        endereco="";
        numero="";
        bairro="";
        complemento="";
        cep="";
        uf="";
    }
    public Pessoa(int idPessoa,String nome,String email,
            String endereco,String numero,String bairro,
            String complemento,String cep, String uf){
        this.idPessoa=idPessoa;
        this.nome = nome;
        this.email=email;
        this.endereco=endereco;
        this.numero=numero;
        this.bairro=bairro;
        this.complemento=complemento;
        this.cep=cep;
        this.uf=uf;
    }
    public void setIdPessoa(int idPessoa){
        this.idPessoa=idPessoa;
    }
    public int getIdPessoa(){
        return idPessoa;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setNumero(String numero){
        this.numero=numero;
    }
    public String getNumero(){ return numero; }
    
    public void setBairro(String bairro){ this.bairro=bairro;}
    public String getBairro(){ return bairro; }
    
    public void setComplemento(String c) { complemento=c; }
    public String getComplemento() { return complemento; }
    
    public void setCep(String cep) { this.cep = cep; }
    public String getCep() { return cep; }
    
    public void setUf(String uf) { this.uf = uf; }
    public String getUf() { return uf; }
    public void lerDados(){
        idPessoa=Integer.parseInt(JOptionPane.showInputDialog("Digite o id"));
        nome=JOptionPane.showInputDialog("Digite o nome");
        email=JOptionPane.showInputDialog("Digite o e-mail");
        endereco=JOptionPane.showInputDialog("Digite o endereço");
        numero=JOptionPane.showInputDialog("Digite o número");
        bairro=JOptionPane.showInputDialog("Digite o bairro");
        complemento=JOptionPane.showInputDialog("Digite o complemento");
        cep=JOptionPane.showInputDialog("Digite o CEP");
        uf=JOptionPane.showInputDialog("Digite a UF");   
    }
    public abstract void visualizarDados();
}
