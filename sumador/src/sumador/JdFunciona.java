package sumador;

import java.util.Scanner;

public class JdFunciona {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número positivo:");
		String numero = sc.nextLine();
		ASumar suma = new ASumar(numero);
		System.out.println(suma.mostrar());

	}

}

