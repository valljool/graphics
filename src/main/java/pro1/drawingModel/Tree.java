package pro1.drawingModel;

import java.awt.*;

public class Tree extends XYShape  {
    private int heightTrunk = 20;
    private int heightCrown = 40;
    private int widthCrown = 40;
    private int widthTrunk = 8;
    private int offset = 4;

    private Rectangle trunk = new Rectangle(0,-20,widthTrunk,heightTrunk,new Color(156, 114, 62));
    private Ellipse crown=new Ellipse(-15,-60,widthCrown,heightCrown,new Color(18, 99, 26));
    private Drawable[] items = new Drawable[]{trunk,crown};
    private Color colour;
        public Tree(int x, int y, Color colour) {
            super(x, y);
            this.colour = colour;
            trunk.x = x-widthTrunk/2;
            trunk.y= y-heightTrunk;
            trunk.colour = colour;
            crown.x = x-widthCrown/2;
            crown.y = y-heightTrunk-heightCrown + offset;
            crown.colour = colour;
        }


        @Override
        public void draw(Graphics2D g) {
            for (Drawable item : items)
            {
                item.draw(g);
            }
        }
    }
