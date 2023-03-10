package view;

import javax.swing.*;

import model.GameCarcassonne;
import model.GameDominos;

import java.awt.*;

public class ContentView extends JFrame {
	public ContentView() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		// récuperer la dimension de l'écran
		
		 int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		 int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		  
		  // régler la taille de JFrame à la taille de l'écran
		 this.setSize(width, height);
		 
		Menu menu = new Menu();
		setContentPane(menu);

		menu.getExitBtn().addActionListener(e -> System.exit(0));

		menu.getDominosBtn().addActionListener(e -> {
			GameView dominosView = new GameView(new GameDominos(menu.getPlayerSelector().getPlayers()));
			this.setContentPane(dominosView);
			validate();
		});

		
		menu.getCarcassoneBtn().addActionListener(e -> {
			GameView carcassonneView = new GameView(new GameCarcassonne(menu.getPlayerSelector().getPlayers()));
			this.setContentPane(carcassonneView);
			validate();
		});
		 

		this.setVisible(true);
	}
}
