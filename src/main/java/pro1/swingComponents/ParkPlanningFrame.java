package pro1.swingComponents;


import pro1.drawingModel.Drawable;
import pro1.drawingModel.Group;
import pro1.drawingModel.Tree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ParkPlanningFrame extends JFrame {
    DrawingPanel drawingPanel;
    private int lastX;
    private int lastY;
    Group grp;
    public ParkPlanningFrame(){
        setTitle("ParkPlanningFrame");
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER );

        OptionsPanel optionsPanel = new OptionsPanel(this);
        add(optionsPanel, BorderLayout.WEST);

        grp = new Group(new Drawable[]{});

        drawingPanel.setImage(grp);
        setVisible(true);

        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
            }
        });
    }

    public void plantATree(Color colour){
        int x = lastX - drawingPanel.getWidth()/2;
        int y = lastY - drawingPanel.getHeight()/2;
        grp.addToGroup(new Tree(x,y,colour));
        drawingPanel.setImage(grp);
    }

    public void removeTrees(){
        grp.resetGroup();
        drawingPanel.setImage(grp);
    }
}
