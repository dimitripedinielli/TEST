package Interface;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Scene extends JPanel {

	private ImageIcon icoFond;
	private Image imgFond1;
	
	private ImageIcon icoHunter; //* code provisoire
	private Image imgHunter; //* code provisoire
	
	private int xFond1;
	private JButton jButton;
	
	//**** CONSTRUCTEUR ****//	
	public Scene(){
		
		super();
		
		this.xFond1 = -50;
		
		icoFond = new ImageIcon(getClass().getResource("/img/Background-2.JPG"));
		this.imgFond1 = this.icoFond.getImage();
		icoHunter = new ImageIcon(getClass().getResource("/img/Hunter.JPG"));
		this.imgHunter = this.icoHunter.getImage();
	}
		
	
	
	//**** METHODES ****//
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		
		g2.drawImage(this.imgFond1, this.xFond1, 0, null); // Dessin de l'image de fond  		 	    
 		g2.drawImage(imgHunter, 400, 650, null); //*** code provisoire
	}
}