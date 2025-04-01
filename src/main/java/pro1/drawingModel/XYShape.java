package pro1.drawingModel;

public abstract class XYShape implements Drawable
{
    protected int x;
    protected int y;

    public XYShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}