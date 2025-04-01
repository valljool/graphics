package pro1.swingComponents;


import pro1.drawingModel.Cross;
import pro1.drawingModel.Group;
import pro1.drawingModel.Tree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ParkPlanningFrame extends JFrame {
    DrawingPanel drawingPanel;
    private int lastX = 0;
    private int lastY=0;
    Group grp;
    Group hlpgrp;
    Group maingrp;
    Cross cross;
    public ParkPlanningFrame(){
        setTitle("ParkPlanningFrame");
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER );

        OptionsPanel optionsPanel = new OptionsPanel(this);
        add(optionsPanel, BorderLayout.WEST);

        cross = new Cross(0,0,20,20,Color.BLACK);
        hlpgrp = new Group();
        grp = new Group();
        maingrp = new Group();
        hlpgrp.addToGroup(cross);
        maingrp.addToGroup(hlpgrp);
        maingrp.addToGroup(grp);

        drawingPanel.setImage(maingrp);

        setVisible(true);


        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lastX = e.getX() - drawingPanel.getWidth()/2;
                lastY = e.getY() - drawingPanel.getHeight()/2;
                cross.setX(lastX);
                cross.setY(lastY);
                drawingPanel.setImage(maingrp);

            }
        });

    }

    public void plantATree(Color colour){
        grp.addToGroup(new Tree(lastX,lastY,colour));
        drawingPanel.setImage(maingrp);
    }

    public void removeTrees(){
        grp.clearGroup();
        drawingPanel.setImage(maingrp);
    }
}
