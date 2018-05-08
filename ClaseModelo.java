import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ClaseModelo {
	
	 // Implementa la lógica del objetivo principal del programa 
	public void bloque(JButton h){
		h.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((10-0+1)*Math.random()+0);
				if(a!=0){
					h.setBackground(java.awt.Color.yellow);
				}
				if(a==0) {
					h.setBackground(java.awt.Color.red);
					int dialogButton = JOptionPane.YES_NO_OPTION;
					JOptionPane.showMessageDialog(null, "Has perdido");
		            System.exit(0);
		          
				}
			}
		}
				);

	}
}
