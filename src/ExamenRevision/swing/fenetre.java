/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenRevision.swing;

import ExamenRevision.interfaces.Grille;
import ExamenRevision.troisieme_partie.Jeu32;
import javax.swing.JFrame;

/**
 *
 * @author Amiour Aimene
 */
public class fenetre extends JFrame {
    
public fenetre (){
    JGrille panel1 ,panel2;
     
    Jeu32 jeu32 = new Jeu32();
    
    panel1 = new JGrille(new Grille(){
        @Override
        public int nbrLigne(){return 5;};
        @Override
        public int nbrColonnes(){return 3;};
        @Override
        public Object at(int ligne ,int colonne ){return ligne*colonne;};
        
    });
    
     panel2 = new JGrille ( jeu32);
      
        getContentPane().add(panel1);
        //getContentPane().add(panel2);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
}    
  public static void main(String[] args) {
        new fenetre();
    }

    
}
