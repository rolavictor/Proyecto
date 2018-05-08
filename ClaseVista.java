import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ClaseVista extends JFrame {

	//creación de variables
	private static final long serialVersionUID = 1L;
	int a=(int) ((3-0+1)*Math.random()+0);
	int cont=0;

	Container bloqueContenedor = null; 

	JButton a1 = null;
	JButton a2 = null;
	JButton a3 = null;
	JButton a4 = null;
	JButton a5 = null;
	JButton a6 = null;
	JButton a7 = null;
	JButton a8 = null;
	JButton a9 = null;
	JButton a10 = null;
	JButton a11 = null;
	JButton a12 = null;
	JButton a13 = null;
	JButton a14 = null;
	JButton a15 = null;
	JButton a16 = null;
	JButton a17 = null;
	JButton a18 = null;
	JButton a19 = null;
	JButton a20 = null;
	JButton a21 = null;
	JButton a22 = null;
	JButton a23 = null;
	JButton a24 = null;
	JLabel etiquetaResultado = null;
	JTextField cajaDeTextoResulado = null;

	public ClaseVista() {
		bloqueContenedor = getContentPane(); 
		setTitle("Calculadora MVC"); 
		setLayout(new FlowLayout()); 
		setSize(240,410);
		etiquetaResultado = new JLabel("Contador "); 
		JTextField cajaDeTextoResultado = new JTextField("", 10); 
		cajaDeTextoResultado.setEnabled(false);

		a1 = new JButton("");
		a2 = new JButton("");
		a3 = new JButton("");
		a4 = new JButton("");
		a5 = new JButton("");
		a6 = new JButton("");
		a7 = new JButton("");
		a8 = new JButton("");
		a9 = new JButton("");
		a10 = new JButton("");
		a11 = new JButton("");
		a12 = new JButton("");
		a13 = new JButton("");
		a14 = new JButton("");
		a15 = new JButton("");
		a16 = new JButton("");
		a17 = new JButton("");
		a18 = new JButton("");
		a19 = new JButton("");
		a20 = new JButton("");
		a21 = new JButton("");
		a22 = new JButton("");
		a23 = new JButton("");
		a24 = new JButton("");
		
		bloqueContenedor.add(etiquetaResultado); 
		bloqueContenedor.add(cajaDeTextoResultado);


		bloqueContenedor.add(a1);
		bloqueContenedor.add(a2);
		bloqueContenedor.add(a3);
		bloqueContenedor.add(a4);
		bloqueContenedor.add(a5);
		bloqueContenedor.add(a6);
		bloqueContenedor.add(a7);
		bloqueContenedor.add(a8);
		bloqueContenedor.add(a9);
		bloqueContenedor.add(a10);
		bloqueContenedor.add(a11);
		bloqueContenedor.add(a12);
		bloqueContenedor.add(a13);
		bloqueContenedor.add(a14);
		bloqueContenedor.add(a15);
		bloqueContenedor.add(a16);
		bloqueContenedor.add(a17);
		bloqueContenedor.add(a18);
		bloqueContenedor.add(a19);
		bloqueContenedor.add(a20);
		bloqueContenedor.add(a21);
		bloqueContenedor.add(a22);
		bloqueContenedor.add(a23);
		bloqueContenedor.add(a24);


		//set button size
		Dimension d = new Dimension(50,50);
		a1.setPreferredSize(d);
		a2.setPreferredSize(d);
		a3.setPreferredSize(d);
		a4.setPreferredSize(d);
		a5.setPreferredSize(d);
		a6.setPreferredSize(d);
		a7.setPreferredSize(d);
		a8.setPreferredSize(d);
		a9.setPreferredSize(d);
		a10.setPreferredSize(d);
		a11.setPreferredSize(d);
		a12.setPreferredSize(d);
		a13.setPreferredSize(d);
		a14.setPreferredSize(d);
		a15.setPreferredSize(d);
		a16.setPreferredSize(d);
		a17.setPreferredSize(d);
		a18.setPreferredSize(d);
		a19.setPreferredSize(d);
		a20.setPreferredSize(d);
		a21.setPreferredSize(d);
		a22.setPreferredSize(d);
		a23.setPreferredSize(d);
		a24.setPreferredSize(d);

		/*cambia color del boton al clickar
		a1.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				a1.setBackground(java.awt.Color.yellow);
			} 
		}
				);*/

		setVisible(true);
	}
}
