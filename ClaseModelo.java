import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ClaseModelo {

	// Implementa la lógica del objetivo principal del programa 
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
					if (reply == JOptionPane.NO_OPTION)
					{
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
