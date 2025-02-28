package src.modeloDados;

public class Curso {

    private String nomeCurso;
    private String qtdSemestre;
    private Professor coordenador; 

    
    public Curso() {
    }

    public Curso(String nomeCurso, String qtdSemestre) {
        this.nomeCurso = nomeCurso;
        this.qtdSemestre = qtdSemestre;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getQtdSemestre() {
        return qtdSemestre;
    }

    public void setQtdSemestre(String qtdSemestre) {
        this.qtdSemestre = qtdSemestre;
    }

    public void vincularCoordenador(Professor professor) {
        this.coordenador = professor;
        System.out.println("Coordenador vinculado com sucesso: " + professor.getNome());
    }

    public Professor getCoordenador() {
        return coordenador;
    }
}