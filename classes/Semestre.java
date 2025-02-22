
package classes;


public class Semestre {
    private boolean frag;
    
    public Semestre(){
        
    }
    
    public Semestre ( boolean frag){
        this.frag = frag;
    }
    
       public boolean getFrag(){
        return frag;
    }

    public void setFrag(boolean frag){
        this.frag = frag;
    }
}
