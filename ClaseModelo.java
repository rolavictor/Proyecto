public class ClaseModelo {
	 // Implementa la lógica del objetivo principal del programa 
	
		public int sumarDosEnteros(String n1, String n2) {
			 int numero1 = Integer.parseInt(n1); 
			 int numero2 = Integer.parseInt(n2);
			 int resultado = numero1 + numero2;
			 return (resultado);
		 }
		public int restarDosEnteros(String n1, String n2) {
			 int numero1 = Integer.parseInt(n1); 
			 int numero2 = Integer.parseInt(n2);
			 int resultado = numero1 - numero2;
			 return (resultado);
		 }
		public int multiplicarDosEnteros(String n1, String n2) {
			 int numero1 = Integer.parseInt(n1); 
			 int numero2 = Integer.parseInt(n2);
			 int resultado = numero1*numero2;
			 return (resultado);
		 }
		public int dividirDosEnteros(String n1, String n2) {
			 int numero1 = Integer.parseInt(n1); 
			 int numero2 = Integer.parseInt(n2);
			 int resultado = numero1 / numero2;
			 return (resultado);
		 }
	}
	