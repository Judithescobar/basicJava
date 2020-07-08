package iLoops;

import libs.Input;

public class Cancionelefantes {

	public static void main(String[] args) {
		//Imprimir camcion 100 veces
		int numero = 1 ;
		while (numero <= 100) {
			if(numero == 1) {
				Input.print(numero + " Elefante se columpiaba sobre la tela de una ara;a" + "\n" + "Como veia que resistia, fueron a llamar a otro elefante" + "\n");
				Input.print("  ");

			}
		else{
				Input.print(numero + " Elefantes se columpiaban sobre la tela de una ara;a" + "\n" + "Como veian que resistia, fueron a llamar a otro elefante" + "\n");
				Input.print("  ");

			}
			numero += 1;
		}
	}
}
