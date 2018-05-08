import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;

public class ClaseControlador implements ActionListener {

	ClaseModelo objModelo = null;
	ClaseVista objVista = null;

	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo) { 
		this.objModelo = objModelo; 
		this.objVista = objVista; 
		actionListener(this); // Escuchador para el botón 
	}



	@Override
	public void actionPerformed(ActionEvent objEvento) { 


		// Capturamos los números desde la vista 
		JButton a1 = this.objVista.a1; 
		JButton a2 = this.objVista.a2;
		JButton a3 = this.objVista.a3;
		JButton a4 = this.objVista.a4;
		JButton a5 = this.objVista.a5;
		JButton a6 = this.objVista.a6;
		JButton a7 = this.objVista.a7;
		JButton a8 = this.objVista.a8; 
		JButton a9 = this.objVista.a9;
		JButton a10 = this.objVista.a10;
		JButton a11 = this.objVista.a11;
		JButton a12 = this.objVista.a12;
		JButton a13 = this.objVista.a13;
		JButton a14 = this.objVista.a14;
		JButton a15 = this.objVista.a15;
		JButton a16 = this.objVista.a16;
		JButton a17 = this.objVista.a17;
		JButton a18 = this.objVista.a18;
		JButton a19 = this.objVista.a19;
		JButton a20 = this.objVista.a20;
		JButton a21 = this.objVista.a21;
		JButton a22 = this.objVista.a22;
		JButton a23= this.objVista.a23;
		JButton a24 = this.objVista.a24;


		objModelo.bloque(a1);
		objModelo.bloque(a2);
		objModelo.bloque(a3);
		objModelo.bloque(a4);
		objModelo.bloque(a5);
		objModelo.bloque(a6);
		objModelo.bloque(a7);
		objModelo.bloque(a8);
		objModelo.bloque(a9);
		objModelo.bloque(a10);
		objModelo.bloque(a11);
		objModelo.bloque(a12);
		objModelo.bloque(a13);
		objModelo.bloque(a14);
		objModelo.bloque(a15);
		objModelo.bloque(a16);
		objModelo.bloque(a17);
		objModelo.bloque(a18);
		objModelo.bloque(a19);
		objModelo.bloque(a20);
		objModelo.bloque(a21);
		objModelo.bloque(a22);
		objModelo.bloque(a23);
		objModelo.bloque(a24);
		
		// Mostramos el resultado en la vista (GUI) 


	}
	public void actionListener(ActionListener escuchador) {
		objVista.a1.addActionListener(escuchador);
		objVista.a2.addActionListener(escuchador);
		objVista.a3.addActionListener(escuchador);
		objVista.a4.addActionListener(escuchador);
		objVista.a5.addActionListener(escuchador);
		objVista.a6.addActionListener(escuchador);
		objVista.a7.addActionListener(escuchador);
		objVista.a8.addActionListener(escuchador);
		objVista.a9.addActionListener(escuchador);
		objVista.a10.addActionListener(escuchador);
		objVista.a11.addActionListener(escuchador);
		objVista.a12.addActionListener(escuchador);
		objVista.a13.addActionListener(escuchador);
		objVista.a14.addActionListener(escuchador);
		objVista.a15.addActionListener(escuchador);
		objVista.a16.addActionListener(escuchador);
		objVista.a17.addActionListener(escuchador);
		objVista.a18.addActionListener(escuchador);
		objVista.a19.addActionListener(escuchador);
		objVista.a20.addActionListener(escuchador);
		objVista.a21.addActionListener(escuchador);
		objVista.a22.addActionListener(escuchador);
		objVista.a23.addActionListener(escuchador);
		objVista.a24.addActionListener(escuchador);
	}
}
