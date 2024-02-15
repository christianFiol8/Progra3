import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	
	
	//Constructor que define atributos basicos de la ventana
	public Ventana() {
		
		this.setTitle("Mi ventana");
		this.setSize(200,200);
		this.setLocation(100, 100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		
		this.iniciarComponentes();
		
	}
	
	public void iniciarComponentes() {
		
		JPanel login = new JPanel() ;
		login.setSize(this.getWidth(), this.getHeight());
		login.setBackground(Color.red);
		
		this.add(login);
		
	}
	
}
