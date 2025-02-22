
package classes;

import java.util.ArrayList;


public class Semestre {
    private String nome;
    private boolean ativa;
    private ArrayList <IObserver>observadores;
    
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
        notifyObservers();
    }
    
     public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void addObservadores(IObserver observer){
        observadores.add(observer);
    }
    
      public void removeObservadores(IObserver observer){
        observadores.remove(observer);
    }
      
      public void notifyObservers (){
          for(int i=0; i<observadores.size(); i++){
           observadores.get(i).update(ativa);
          }
      }
}
