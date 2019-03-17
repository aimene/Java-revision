
package Interfaces.implementation;

import interfaces.Mesurable;
import java.awt.Rectangle;

public class RectangleSurface extends Rectangle implements Mesurable {

    public RectangleSurface(int width, int height) {
        super(width, height);
    }

    @Override
    public int mesure() {
        return this.height*this.width;
    }

}
