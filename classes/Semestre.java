
package classes;


public class Semestre {
    private String nome;
    private boolean ativa;
    
    public Semestre(){
        
    }
    
    public Semestre (String nome, boolean ativa){
        this.ativa = ativa;
        this.nome = nome;
    }
    
       public boolean getAtiva(){
        return ativa;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }
    
     public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
