import java.awt.Container; 
import java.awt.FlowLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JTextField;

public class ClaseVista extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	Container bloqueContenedor = null; 
	JTextField cajaDeTextoNumero1 = null; 
	JTextField cajaDeTextoNumero2 = null; 
	JTextField cajaDeTextoResultado = null; 
	JLabel etiquetaNumero1 = null; 
	JLabel etiquetaNumero2 = null;
	JLabel etiquetaResultado = null; 
	JButton botonSumar = null;
	JButton botonRestar = null;
	JButton botonMultiplicar = null;
	JButton botonDividir = null;
	
	public ClaseVista() {
		bloqueContenedor = getContentPane(); 
		setTitle("Calculadora MVC"); 
		setLayout(new FlowLayout()); 
		setSize(220,200);
	
	etiquetaNumero1 = new JLabel("Numero 01: "); 
	cajaDeTextoNumero1 = new JTextField("", 10); 
	etiquetaNumero2 = new JLabel("Numero 02: "); 
	cajaDeTextoNumero2 = new JTextField("", 10); 
	etiquetaResultado = new JLabel("Resultado: "); 
	cajaDeTextoResultado = new JTextField("", 10); 
	cajaDeTextoResultado.setEnabled(false);
	botonSumar = new JButton("Sumar");
	botonRestar = new JButton("Restar");
	botonMultiplicar = new JButton("Multiplicar");
	botonDividir = new JButton("dividir");
	
	bloqueContenedor.add(etiquetaNumero1); 
	bloqueContenedor.add(cajaDeTextoNumero1); 
	bloqueContenedor.add(etiquetaNumero2); 
	bloqueContenedor.add(cajaDeTextoNumero2); 
	bloqueContenedor.add(etiquetaResultado); 
	bloqueContenedor.add(cajaDeTextoResultado);
	bloqueContenedor.add(botonSumar);
	bloqueContenedor.add(botonRestar);
	bloqueContenedor.add(botonMultiplicar);
	bloqueContenedor.add(botonDividir);
	setVisible(true);
}
}
