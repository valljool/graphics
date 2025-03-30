package pro1.drawingModel;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Group implements Drawable{
    private Drawable[] items;
    private List<Drawable> list = new ArrayList<>();

    public Group(Drawable[] items) {
        this.items = items;
    }

    @Override
    public void draw(Graphics2D g) {
//        for (Drawable item : items)
//        {
//            item.draw(g);
//        }

        for(Drawable item : list){
            item.draw(g);
        }
    }

    public void addToGroup(Drawable item){
        list.add(item);
    }

    public void resetGroup(){
        list.clear();
    }
}
