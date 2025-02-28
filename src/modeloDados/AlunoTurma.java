package src.modeloDados;

public class AlunoTurma {
    private Aluno aluno;
    private Nota nota;

    public AlunoTurma(){}
    
    public AlunoTurma(Aluno aluno){
        this.aluno = aluno;
        this.nota = new Nota();
    }

    public AlunoTurma(Aluno aluno, Nota nota){
        this.aluno = aluno;
        this.nota =nota;
    }

    public Nota getNota(){
        return nota;
    }

    public void setNota(Nota nota){
        this.nota = nota;
    }

    public Aluno getAluno(){
        return aluno;
    }

    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }
}
