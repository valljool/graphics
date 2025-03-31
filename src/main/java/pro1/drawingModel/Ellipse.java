package pro1.drawingModel;

import java.awt.*;

public class Ellipse extends AbstractShape{
    public Ellipse(int x, int y, int width, int height, Color colour) {
        super(x, y, width, height, colour);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(colour);
        g.fillOval(x,y,width,height);
    }
}
