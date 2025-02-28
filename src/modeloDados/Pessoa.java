package src.modeloDados;

import src.IO.IOPrintable;

public abstract class Pessoa implements IOPrintable{

  private String nome;
  private String cpf;
  private String telefone;
  private String endereco;

  Pessoa(){

  }

  public Pessoa(String nome, String cpf, String telefone, String endereco){
    super();
      this.nome = nome;
      this.cpf = cpf;
      this.telefone = telefone;
      this.endereco = endereco;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this. nome = nome;
  }

  public String getCpf(){
    return cpf;
  }

  public void setCpf(String cpf){
    this. cpf = cpf;
  }

  public String getTelefone(){
    return telefone;
  }

  public void setTelefone(String telefone){
    this. telefone = telefone;
  }
  
  public String getEndereco(){
    return endereco;
  }

  public void setEndereco( String endereco){
    this. endereco = endereco;
  }

  public void exibirDados(){
    System.out.println("Nome: " + getNome() + ", CPF: " + getCpf() + ", Endereço: " + getEndereco() + ", Telefone: " + getTelefone());
  }

  public void imprimirDados(){
    
  }

}