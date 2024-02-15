import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame ventana = new JFrame("Example");
		
		
		ventana.setSize(500, 500);
		//ventana.setLocation(10,10);
		ventana.setVisible(true);
		
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}
