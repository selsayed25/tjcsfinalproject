package jsnake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.File;


public class MainMenu extends JPanel {
    MainScene menu;

    public MainMenu() {
        setLayout(new GridBagLayout());

        // Public Pixel Font
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("../jsnake/PublicPixel.ttf")));
        } 
        
        catch (IOException | FontFormatException e) {
            // Handle exception
        }

        //menu = panel;

        GridBagConstraints formatText = new GridBagConstraints();
        GridBagConstraints formatButton = new GridBagConstraints();

        JLabel title = new JLabel("JSnake");
        title.setFont(new Font("Sans-serif", Font.BOLD, 45));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        formatText.insets = new Insets(10, 10, 0, 10);
        formatText.anchor = GridBagConstraints.PAGE_START;
        formatText.fill = GridBagConstraints.HORIZONTAL;
        add(title, formatText);

        JButton startButton = new JButton("Start");
        startButton.addActionListener(new StartListener());
        startButton.setFont(new Font("Public Pixel", Font.PLAIN, 20));
        formatButton.gridx = 0;
        formatButton.gridy = 1;
        formatButton.insets = new Insets(0, 10, 10, 10);
        formatButton.fill = GridBagConstraints.HORIZONTAL;
        add(startButton, formatButton);

        JButton optionsButton = new JButton("More");
        optionsButton.addActionListener(new OptionsListener());
        optionsButton.setFont(new Font("Public Pixel", Font.PLAIN, 20));
        formatButton.gridx = 0;
        formatButton.gridy = 2;
        formatButton.insets = new Insets(0, 10, 10, 10);
        formatButton.fill = GridBagConstraints.HORIZONTAL;
        add(optionsButton, formatButton);
    }

	private class StartListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Game newGame = new Game();
        }
    }

    private class OptionsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Options newOptions = new Options();
        }
    }
}