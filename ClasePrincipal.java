public class ClasePrincipal {
	/**
	 * @author Noruega
	 * @param args
	 */
	public static void main(String args[]) {
		ClaseModelo modelo = new ClaseModelo(); 
		ClaseVista vista = new ClaseVista();

		new ClaseControlador(vista, modelo); 
	} 
}
