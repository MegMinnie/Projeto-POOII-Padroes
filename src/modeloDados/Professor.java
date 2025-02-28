package src.modeloDados;

public class Professor extends Pessoa {

 private String siape;
 private boolean coordenador = false;
 private String senha;

 public Professor(){
 super();
  }
  
  public Professor( String nome, String cpf, String telefone, String endereco, String siape, String senha){
  super(nome, cpf, telefone, endereco);
  this.senha  =  senha;
  this.siape = siape;
  }
 
 

  public String getSiape(){
    return siape;
  }

  public void setSiape( String siape){
    this.siape = siape;
  }

  public String getSenha(){
    return senha;
  }

  public void setSenha(String senha){
    this.senha = senha;
  }


  public boolean getCoordenador(){
    return coordenador;
  }

  public void setCoodernador( boolean coordenador){
    this.coordenador = coordenador;
  }

  public void exibirDados(){
    super.exibirDados();
    System.out.println("SIAPE: " + siape);
  }

}