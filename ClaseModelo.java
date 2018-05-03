import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ClaseModelo {
	 // Implementa la lógica del objetivo principal del programa 
	public void bloque(JButton h){
		h.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				h.setText(""+a);
				if(a==0) {
					//si responde si, seguir jugando. si pone otra cosa que acabe el programa
					int dialogButton = JOptionPane.YES_NO_OPTION;
					JOptionPane.showMessageDialog(null, "Has perdido");
		            System.exit(0);
		          
				}
			}
		}
				);
	}
}
	
