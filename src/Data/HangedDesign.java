package Data;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Clase que hereda de JPanel, simplemente, cambia el estado de juego añadiendo una nueva pieza al cuerpo del ahorcado. 
 * Cuando el jugador falla, se hace una llamada al método paint, cambiado el estado del jugador ahorcado.
 * @author Álvaro Rofa Aranda
 */
public class HangedDesign extends JPanel{
    private int state;
    private ImageIcon img;
    public HangedDesign(){
        state = 0;
        this.setSize(100, 150);
    }   
    
    
    /**
     * En cada fallo, se incrementa en uno el estado del juego, cambiado la imagen del ahorcado.
     * @param g 
     */
    @Override
    public void paint(Graphics g){
        Dimension height = getSize();
        state++;
        img = new ImageIcon(getClass().getResource("/Images/hanged" + state + ".png"));
        g.drawImage(img.getImage(), 0,0,height.width, height.height, null);
        setOpaque(false);
        super.paintComponents(g);
    }
}
