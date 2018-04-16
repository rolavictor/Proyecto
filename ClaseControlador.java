 import java.awt.event.ActionEvent; 
 import java.awt.event.ActionListener;
 
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
		try {
			int resultado = 0;
			// Capturamos los números desde la vista 
			String numero1 = this.objVista.cajaDeTextoNumero1.getText(); 
			String numero2 = this.objVista.cajaDeTextoNumero2.getText();
			
			if(objEvento.getSource() == objVista.botonMultiplicar) {
				resultado = objModelo.multiplicarDosEnteros(numero1, numero2);
			} else if (objEvento.getSource() == objVista.botonSumar) {
				resultado = objModelo.sumarDosEnteros(numero1, numero2);
			} else if (objEvento.getSource() == objVista.botonRestar) {
				resultado = objModelo.restarDosEnteros(numero1, numero2);
			} else  {
				resultado = objModelo.dividirDosEnteros(numero1, numero2);
			}
			objVista.cajaDeTextoResultado.setText( "" + resultado );
			// Mostramos el resultado en la vista (GUI) 
			 

		}
		catch(Exception objExcepcion) {
			objExcepcion.printStackTrace();
		}
	}
   public void actionListener(ActionListener escuchador) {
	 objVista.botonSumar.addActionListener(escuchador);
	 objVista.botonRestar.addActionListener(escuchador);
	 objVista.botonMultiplicar.addActionListener(escuchador);
	 objVista.botonDividir.addActionListener(escuchador);
	 }
 }

 	
 	
 
