/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenRevision.troisieme_partie;



import java.util.Objects;

/**
 *
 * @author Amiour Aimene
 */
public  class  Carte {
    private  String figure ;
    private  String couleur ;
    private  String abv ;
    private  int position ; 
    
    private boolean hidden ;

    

    public Carte(String figure, String couleur, String abv, int position ) {
        this.figure = figure;
        this.couleur = couleur;
        this.abv = abv;
        this.position = position;
        this.hidden = false;
    }
    
    public Carte(String figure, String couleur, int position) {
          this( figure, couleur,figure.substring(0, 1).concat(couleur.substring(0, 1)) ,
                  position);

        //  new String ()
          //        .concat(String.valueOf(figure.charAt(0)))
            //      .concat(String.valueOf(couleur.charAt(0)))
          //;     
    }
    
      public Carte(String figure, String couleur) {
          this( figure, couleur,0);
    }
    
    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
    
 

    public String getFigure() {
        return figure;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getAbv() {
        return abv;
    }

    public int getPosition() {
        return position;
    }
    
      

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.figure);
        hash = 97 * hash + Objects.hashCode(this.couleur);
        hash = 97 * hash + Objects.hashCode(this.abv);
        hash = 97 * hash + this.position;
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
        final Carte other = (Carte) obj;
        if (this.position != other.position) {
            return false;
        }
        if (!Objects.equals(this.figure, other.figure)) {
            return false;
        }
        if (!Objects.equals(this.couleur, other.couleur)) {
            return false;
        }
        
        if (!abv.equals(other.abv)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if(isHidden()){
            return "[]";
        }else {
            return this.abv;
        }
    }
    

    
}
