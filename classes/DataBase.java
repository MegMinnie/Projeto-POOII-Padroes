package classes;

import java.util.ArrayList;

//APLIQUE SINGLETON NESTA CLASSE

public class DataBase {
    
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Curso> cursos;
    private ArrayList<Turma> turmas;

    private static DataBase instance;
    private  DataBase() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.turmas = new ArrayList<>();

        //ESSE TRECHO É TESTE. DEVE SER APAGADO NA VERSÃO FINAL
        alunos.add(new Aluno("Mirele Oliveira", "111.111.111-11", "(11) 91111-1111", "Rua A, Bairro A", "1111111", 7.0));
        alunos.add(new Aluno("Gabriel Cavalcante", "222.222.222-22", "(22) 92222-2222", "Rua B, Bairro B", "2222222", 7.0));
        alunos.add(new Aluno("Carlos Eduardo", "333.333.333-33", "(33) 93333-33333", "Rua C, Bairro C", "3333333", 7.0));
        alunos.add(new Aluno("Michael Jackson", "444.444.444-44", "(44) 94444-4444", "Rua D, Bairro D", "4444444", 7.0));
        alunos.add(new Aluno("Jair Bolsonaro", "555.555.555-55", "(55) 95555-5555", "Rua E, Bairro E", "5555555", 7.0));
    
        professores.add(new Professor("Luís Araújo", "666.666.666-66", "(66) 96666-6666", "Rua F, Bairro F", "244576", "12345"));
        professores.add(new Professor("Beto Carneiro", "777.777.777-77", "(77) 97777-7777", "Rua G, Bairro G", "325078", "12345"));

        cursos.add(new Curso("Linguagem de programação", "3"));
        cursos.add(new Curso("Estrutura de dados", "5"));

        turmas.add(new Turma("20243", cursos.get(0), "5"));
        turmas.add(new Turma("20247", cursos.get(1), "6"));

        turmas.get(0).adicionarProfessor(professores.get(0));
        for (Aluno aluno : alunos) {
        turmas.get(0).adicionarAluno( new AlunoTurma(aluno) );
        }

        turmas.get(1).adicionarProfessor(professores.get(1));
        
        for (Aluno aluno : alunos) {
        turmas.get(1).adicionarAluno(new AlunoTurma(aluno));
        }
    
    }
public static DataBase getInstance(){
    if(instance == null)
        instance = new DataBase();
    return instance;
}
    
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
}
