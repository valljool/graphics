package pro1.swingComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionsPanel extends JPanel {
    JTextField textField;
    JButton buttonDraw;
    JButton buttonReset;
    public OptionsPanel(ParkPlanningFrame parkPlanningFrame){
        setPreferredSize(new Dimension(200,0));
        setBackground(Color.gray);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(200,24));
        add(textField);




        buttonDraw = new JButton("Plant");
        buttonReset = new JButton("Reset");
        add(buttonDraw);
        add(buttonReset);


        buttonDraw.addActionListener((e)->{
            String input = textField.getText();
            Color colour;
            try{
                colour = Color.decode(input);
            }catch (Exception ex){
                colour = Color.BLACK;
            }

            parkPlanningFrame.plantATree(colour);

        });

        buttonReset.addActionListener((e)->{
           parkPlanningFrame.removeTrees();

        });
    }



}
