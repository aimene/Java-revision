/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenRevision.premiere_partie;

import java.util.Arrays;

/**
 *
 * @author Amiour Aimene
 */
public class Jeu32 {
    
    private final Carte[] cartes;
    
    public Jeu32 (){
        cartes=new Carte[32];
        String [] figures={"7","8","9","10","Valet","Dame","Roi","As"};
        String [] couleurs={"trèfle","pique","coeur","careau"};
        String [] abr={"\\u2660","\\u2661","\\u2662’","\\u2663"};
        int pos=0;
        for(int i =0 ; i<4; i++){
            for (int j = 0; j < 8; j++) {
                cartes[pos]=new Carte(figures[j],couleurs[i],figures[j].substring(0, 1).concat(abr[i]),pos);
                pos++;
            }
        }

       
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Arrays.deepHashCode(this.cartes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jeu32 other = (Jeu32) obj;
    
    
         
       if (!Arrays.deepEquals(this.cartes, other.cartes)) {
            return false;
        }
        
        return true;
    }

    
    
    @Override
    public String toString() {
        String s="" ;
        for (int i = 0; i < 32; i++) {
            s+=cartes[i].toString()+"";
        }
        return "Jeu32{" + "cartes=" + s + '}';
    }
    
      public static void main(String[] args)  {
          Jeu32 jeu1= new Jeu32();
          Jeu32 jeu2= new Jeu32();
          
          Jeu32 jeu3 = jeu1;

        
              System.out.println(jeu1.equals(jeu2));             
              System.out.println(jeu1.equals(jeu3)); 

              
          
    }
    
}
