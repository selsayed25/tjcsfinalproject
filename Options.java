package jsnake;

import javax.swing.*;
import javafx.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.File;

public class Options extends JPanel {
    MainScene menu;
    
    public Options() {
        setLayout(new GridBagLayout());

        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("../jsnake/PublicPixel.ttf")));
        }

        catch (IOException | FontFormatException e) {
            // Handle exception
        }

        //menu = panel;

        GridBagConstraints formatButton = new GridBagConstraints();

        JButton customButton = new JButton("Customize");
        customButton.addActionListener(new CustomizeListener());
        customButton.setFont(new Font("Public Pixel", Font.PLAIN, 20));
        formatButton.gridx = 0;
        formatButton.gridy = 1;
        formatButton.insets = new Insets(0, 10, 10, 10);
        formatButton.fill = GridBagConstraints.HORIZONTAL;
        add(customButton, formatButton);

        JButton helpButton = new JButton("Guide");
        helpButton.addActionListener(new HelpListener());
        helpButton.setFont(new Font("Public Pixel", Font.PLAIN, 20));
        formatButton.gridx = 0;
        formatButton.gridy = 2;
        formatButton.insets = new Insets(0, 10, 10, 10);
        formatButton.fill = GridBagConstraints.HORIZONTAL;
        add(helpButton, formatButton);
    }

    private class CustomizeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Customize newCustom = new Customize();
        }
    }

    private class HelpListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
        }
    }
}