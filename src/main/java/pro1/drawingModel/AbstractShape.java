package pro1.drawingModel;

import java.awt.*;

public abstract class AbstractShape extends  XYShape{
    protected int height;
    protected int width;
    protected Color colour;

    public AbstractShape(int x, int y, int width, int height,Color colour) {
        super(x, y);
        this.height = height;
        this.width = width;
        this.colour = colour;
    }
}
