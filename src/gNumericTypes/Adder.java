package gNumericTypes;

import libs.Input;

public class Adder {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is: "); // funcion para imprimir en consola
	    int x = Input.get_int(); //Espera dato numerico y almacena el valor en X
	    
	    // prompt user for y
	    System.out.print("y is: ");//Imprimir en consola un texto
	    int y = Input.get_int();//Espera dato numerico y almacena el valor en y
	    
	    // calculate sum for user
	    System.out.println("sum is " + (x + y) + "\n");   //Muestra el resultado
	}
}