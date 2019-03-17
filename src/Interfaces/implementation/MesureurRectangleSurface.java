/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces.implementation;

import interfaces.Mesureur;
import java.awt.Rectangle;


public class MesureurRectangleSurface implements Mesureur {

    @Override
    public int mesure(Object o) {
        return ((Rectangle) o).height * ((Rectangle) o).width;
    }

}
