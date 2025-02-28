package src.modeloDados;

import src.IO.IOPrintable;

public class Aluno extends Pessoa implements IOPrintable {
private String matricula;

 
  public Aluno() {}

  public Aluno(String nome, String cpf, String telefone, String endereco, String matricula, Double     notaRecuperacao) {
   super(nome, cpf, telefone, endereco);
   this.matricula = matricula;
  
  }

  public String getMatricula() {
    return this.matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }
  
  

  public void exibirDados() {
    System.out.println("Nome: " + this.getNome());
    System.out.println("CPF: " + this.getCpf());
    System.out.println("Endereço: " + this.getEndereco());
    System.out.println("Telefone: " + this.getTelefone());
    System.out.println("Matrícula: " + this.matricula);
  }

  public void exibirHistorico() {
    System.out.println("Histórico do aluno " + this.getNome() + ":");
  }
}