package jsnake;

import java.awt.CardLayout;
import javax.swing.JPanel;

public class MainScene extends JPanel {
    private MainMenu menu;
    private CardLayout card;

    public MainScene() {
        setLayout(new CardLayout());
        menu = new MainMenu(this);
        add(menu, "Menu Card");
        card = (CardLayout)(getLayout());        
    }

    public void gameScene() {
        card.show(this, "Game Card");
    }
}