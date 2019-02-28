package sumador;

public class ASumar {

	private String valor_inicial;

	public ASumar(String string) { // Este método almacena la variable que le introducimos
		this.valor_inicial = string;
	}
	public String total() {// Este método calcula  la suma y la cadena del resultado
        int suma = 0;
        String resultado ="";
        String numero = valor_inicial;
        for (int i = 0; i < numero.length(); i++) {
            String digito = numero.substring(i,i+1);
            suma += Integer.parseInt(digito);
            if (i < 1) {
            	resultado += digito;
            }else {
            	resultado += "+"+digito;
            }
        }
        return (resultado + " = " + suma);

    }
	public String mostrar() { //Este método muestra el resultado a partir de la variable introducida
		 String numero = valor_inicial;
		 if (numero.length() == 1) {
	            return (numero + " = " + numero);
		}
		 else if (Integer.parseInt(numero) < 0) {
			 return ("");
		}
	        
	      else 	 return (total());
	}
}
