package pro1.swingComponents;

import pro1.drawingModel.Drawable;

import javax.swing.*;
import java.awt.*;

public class DrawingPanel extends JPanel {
    int height = getWidth();
    int width = getWidth();
    Drawable image;

    public DrawingPanel(){
        setBackground(new Color(176, 234, 165));

    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.translate(getWidth()/2,getHeight()/2);
        g.drawLine(-5000,0,5000,0);
        g.drawLine(0,-5000,0,5000);
        if(image !=null) {
            image.draw((Graphics2D) g);
        }
    }

    public void setImage(Drawable image)
    {
        this.image = image;
        repaint();
    }
}
