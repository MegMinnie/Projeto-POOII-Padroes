package src.modeloDados;

public class Recuperacao implements IOEstados{
  
   public void alterarNota( Nota nota, AlunoTurma alunoTurma){
   alunoTurma.getNota().modificarNota(valor);
   System.out.println("Nota alterada com sucesso!");
}
