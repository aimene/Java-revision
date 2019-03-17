/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenRevision.interfaces;

/**
 *
 * @author Amiour Aimene
 */
public interface Grille {
    int nbrLigne();
    int nbrColonnes();
    Object at(int ligne ,int Colonne);
    
}
