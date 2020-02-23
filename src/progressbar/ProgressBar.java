/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progressbar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import vistas.JFrame;
import vistas.LayoutPrincipal;

/**
 *
 * @author Walter Gdmz
 */
public class ProgressBar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame progressbar = new JFrame();
        progressbar.setVisible(true);
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProgressBar.class.getName()).log(Level.SEVERE, null, ex);
        }
        progressbar.dispose();
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                LayoutPrincipal nuevoJFrame = new LayoutPrincipal();
                nuevoJFrame.setVisible(true);
            }
        });
    }
    
}
