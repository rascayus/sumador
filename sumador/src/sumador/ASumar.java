package sumador;

public class ASumar {

	private String valor_inicial;

	public ASumar(String string) { // Este método almacena la variable que le introducimos
		this.valor_inicial = string;
	}

	public String mostrar() { //Este método muestra el resultado a partir de la variable introducida
		 String numero = valor_inicial;
		 int suma = 0;
		 if (numero.length() == 1) {
	            return (numero + " = " + numero);
		}
		 else if (Integer.parseInt(numero) < 0) {
			 return ("");
		}
	        
	      else return ("Introduzca un número valido");
	}
}
