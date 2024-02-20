import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	
	
	//Constructor que define atributos basicos de la ventana
	
	public Ventana() {
		
		this.setTitle("Mi ventana");
		this.setSize(1000,500);
		this.setLocation(200, 200);
		
			
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		
		this.setLayout(null);
		
		this.iniciarComponentes();
		
	}
	
	public void iniciarComponentes() {
		
		JPanel login = new JPanel() ;
		login.setSize(this.getWidth()/2, this.getHeight());
		login.setBackground(Color.blue);
		login.setLayout(null);
		
		
	
		JLabel loginTitle = new JLabel ("ACCEDER" , 0);
		loginTitle.setFont(new Font("Agency FB" , Font.BOLD , 34));
		loginTitle.setForeground(Color.white);
		loginTitle.setLocation(100, 30);
		loginTitle.setSize(300, 90);
		loginTitle.setOpaque(true);
		loginTitle.setBackground(Color.gray);
		login.add(loginTitle);
		
		//Siempre tienen size, location, string (constructor)
		
		JPanel registro = new JPanel() ;
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setBackground(Color.green);
		registro.setLocation(500,0);
		
		this.add(login);
		this.add(registro);
		
	}
	
}
