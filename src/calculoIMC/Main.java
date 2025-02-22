package calculoIMC;

import java.util.*;

/**
 * Esta aplicación calcula el índice de masa coroporal en las personas. los datos estarán dentro de un ranto 
 * @author Jose F Montero.
 * @version 1.0
 * Programa principal para el cálculo del IMC de una persona.
 */

/**
 * Clase Main principal.
 * @author Jose F Montero
 * @version 1.0
 * 
 */
public class Main { 
	
	/**
	 * Método principal que ejecuta el programa.
	 * Formado por un menú con 2 opciones y el posterior cálculo del imc.
	 * @param args (los parámetros que se utilizan se optienen a través de la introducción por pantalla por parte del usuario.
	 */
	public static void main(String[] args) {  //Clase Principal del programa.
		// TODO Auto-generated method stub
		boolean continuar = true;  //uso en el while para que se repita el menú
		Scanner sc = new Scanner(System.in);
		
		while (continuar) {
			System.out.println("\n ### MENU ## \n Selecciona una opción \n 1. Calcular IMC \n 2. Salir"); //Menú de la app.		
			try {
				int opcion = sc.nextInt();
				switch (opcion) {
			
				case 1:
						System.out.println("Introduce tu peso en kg (entre 0 y 200kg)");  //Solicitamos el peso en Kg.
						double peso = sc.nextDouble(); 
						System.out.println("Introduce tu altura en cm (entre 30 y 250cm"); //Solicitamos la altura en cm.
						double altura = sc.nextDouble();
						persona persona1 = new persona(peso, altura); // Creamos la clase persona y le damos los datos de peso y altura.
						System.out.println("Los datos introducidos son: " + persona1.toString());
						persona1.calcularIMC(peso, altura); //Con el método calcularIMC de la clase persona calculamos el IMC.
						break;
	
				case 2: {
					System.out.println("\n ## Saliendo del programa. Gracias por utilizar IMC calculator.##"); //Opción 2 salida del programa.
					continuar = false;
					break;	
				} 	
			
				default: System.out.println("Opción no válida elija 1 o 2 para continuar o salir."); //Manejo de opciones diferentes a 1 o 2.
				break;
				}// SWITCH	
			}
			
			catch (Exception e) {
				System.out.println("Dato no válido"); //@exception Para el manejo de excepciones con datos erroneos.
				sc.nextLine();
			}
				
		}//WHILE
		sc.close();	
	}//VOID MAIN
	
}//CLASS MAIN
