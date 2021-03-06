/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.exo5;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author yvan
 */
public class BoutonRecalcitrant extends JFrame {

    private JButton bouton;
    private int x, y;

    public BoutonRecalcitrant() {
        miseEnPlaceDesComposants();
        miseEnPlacesDesEcouteurs();
        miseEnPlaceUI();

    }

    private void miseEnPlaceDesComposants() {
        bouton = new JButton("Pas touche !");
        getContentPane().add(bouton);
    }

    private void miseEnPlacesDesEcouteurs() {
        bouton.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                if (x + bouton.getPreferredSize().width > getContentPane().getWidth()) {
                    x = 0;
                }
                if (y + bouton.getPreferredSize().height > getContentPane().getHeight()) {
                    y = 0;
                }
                bouton.setBounds(x, y, bouton.getPreferredSize().width, bouton.getPreferredSize().height);
            }

        });
        addMouseMotionListener(new MouseAdapter() {

            @Override
            public void mouseMoved(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }

        });
    }

    private void miseEnPlaceUI() {
        getContentPane().setPreferredSize(new Dimension(400, 400));
        getContentPane().setLayout(null);
        x = getContentPane().getWidth() / 2 - bouton.getPreferredSize().width / 2;
        y = (getContentPane().getHeight() - bouton.getPreferredSize().height) / 2;

        bouton.setBounds(x, y, bouton.getPreferredSize().width, bouton.getPreferredSize().height);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BoutonRecalcitrant();
    }
}
