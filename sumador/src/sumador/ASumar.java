package sumador;

/**
 * @author Juan Diego Alonso Navarro
 * version 1.0
 *
 */
public class ASumar {

	private String valor_inicial;

	/**
	 *  Este método almacena la variable que le introducimos
	 * @param valor_inicial
	 */
	public ASumar(String valor_inicial) {
		this.valor_inicial = valor_inicial;
	}
	/**
	 * Este método calcula  la suma y la cadena del resultado
	 * @return Devuelve la suma de los digitos de la cadena introducida y la cadena con los dígitos
	 */
	public String total() { 
        int suma = 0;
        String resultado ="";
        for (int i = 0; i < valor_inicial.length(); i++) {
            String digito = valor_inicial.substring(i,i+1);
            suma += Integer.parseInt(digito);
            if (i < 1) {
            	resultado += digito;
            }else {
            	resultado += "+"+digito;
            }
        }
        return (resultado + " = " + suma);

    }
	/**
	 * Este método muestra el resultado a partir de la variable introducida
	 * @return Devuelve cadena vacia si es negativo o el resultado esperado si es positivo
	 */
	public String mostrar() { //
		 String numero = valor_inicial;
		 if (Integer.parseInt(numero) < 0) {
			 return ("");
		}
	        
	      else 	 return (total());
	}
}
