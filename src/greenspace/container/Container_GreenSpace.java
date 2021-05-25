package greenspace.container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


import greenspace.modelos.Fase;

public class Container_GreenSpace extends JFrame {

	public Container_GreenSpace() {
		add(new Fase());
		setTitle("Green Space");
		ImageIcon icone = new ImageIcon("res\\icon_spaceship.png");
		this.setIconImage(icone.getImage());
		
		setSize(1024, 768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		this.setResizable(false);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Container_GreenSpace();
	}

}
