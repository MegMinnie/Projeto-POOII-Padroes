package src.Historico;

import src.modeloDados.Nota;
import src.modeloDados.Professor;

public class Log {
  private Nota notaAnterior;
  private Nota notaAtual;
  private Professor responsavel;

  public Log(Professor responsavel, Nota notaAnterior, Nota notaAtual) {
      this.responsavel = responsavel;
      this.notaAnterior = notaAnterior;
      this.notaAtual = notaAtual;
  }

    public Nota getNotaAtual() {
        return notaAtual;
    }

    public void setNotaAtual(Nota notaAtual) {
        this.notaAtual = notaAtual;
    }

    public Nota getNotaAnterior() {
        return notaAnterior;
    }

    public void setNotaAnterior(Nota notaAnterior) {
        this.notaAnterior = notaAnterior;
    }

    public  void printLog(){
      System.out.print("Responsavel: " + responsavel.getNome());
      System.out.println(" -  Alteração de Nota: " + notaAnterior + " para "+ notaAtual);
    }
}