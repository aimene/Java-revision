/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenRevision.swing;

import ExamenRevision.interfaces.Grille;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Amiour Aimene
 */
public class JGrille extends JPanel {
    
   public JGrille ( Grille grille){
       GridLayout gl = new GridLayout(grille.nbrLigne(),grille.nbrColonnes());
       this.setLayout(gl);
       for (int i = 1; i <= grille.nbrLigne(); i++) {
           for (int j = 1; j <= grille.nbrColonnes(); j++) {

               this.add(new JLabel(grille.at(i, j).toString()));
               
           }
       }
   }
    
}
