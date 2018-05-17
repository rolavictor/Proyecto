import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ClaseModelo {

	/**
	 * @author Noruega
	 * Cuando se clicka en un botón se genera el botón rojo o el amarillo, 
	 * después aparece una ventana para seguir jugando o terminar el programa.
	 * */
	public void bloque(JButton h){
		h.addMouseListener(new java.awt.event.MouseAdapter() { 

			public void mouseClicked(java.awt.event.MouseEvent e) { 

				int a=(int) ((24-0+1)*Math.random()+0);
				if(a!=0){
					h.setBackground(java.awt.Color.yellow);
				}
				if(a==0) {
					h.setBackground(java.awt.Color.red);
					
					int reply=JOptionPane.showConfirmDialog(null, "HAS PERDIDO ¿Quieres volver a jugar?","Alerta", JOptionPane.YES_NO_OPTION);
					if (reply == JOptionPane.NO_OPTION){
						System.exit(0);
					}else{
						ClaseModelo modelo = new ClaseModelo(); 
						ClaseVista vista = new ClaseVista();
						new ClaseControlador(vista, modelo); 
					}
				}
			}
		}
				);

	}
}
