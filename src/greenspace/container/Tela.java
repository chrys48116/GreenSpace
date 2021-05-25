package greenspace.container;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import greenspace.container.Container_GreenSpace;
import greenspace.modelos.Fase;

public class Tela extends JFrame {
	private Image fundotela;
	private Container_GreenSpace container_GreenSpace;

	public Tela() {
		JLabel background;
		setTitle("Green Space");
		ImageIcon icone = new ImageIcon("res\\icon_spaceship.png");
		this.setIconImage(icone.getImage());

		ImageIcon img = new ImageIcon("res\\nomejogo.png");

		background = new JLabel("", img, JLabel.CENTER);
		background.setBounds(0, 0, 1024, 768);
		add(background);

		setSize(1024, 768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);

		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int codigo = e.getKeyCode();
				if (codigo == KeyEvent.VK_ENTER) {
					add(new Container_GreenSpace());
				}
			}
		});

	}

	public static void main(String[] args) {
		new Tela();
	}

}
