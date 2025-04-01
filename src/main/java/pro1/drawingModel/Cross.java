package pro1.drawingModel;

import java.awt.*;

public class Cross extends  AbstractShape{
    public Cross(int x, int y, int width, int height, Color colour) {
        super(x, y, width, height, colour);
    }



    @Override
    public void draw(Graphics2D g) {
        g.setColor(colour);
        g.drawLine((-width/2)+x,y,width/2+x,y);
        g.drawLine(x,(-height/2)+y,x,y+(height/2));
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }
}
