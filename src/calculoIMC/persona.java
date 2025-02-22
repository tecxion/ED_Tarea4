package calculoIMC;

/**
 * 
 * Clase persona, realizamos la operación del cálculo del imc con los datos que introduce el usuario.
 */

public class persona {

	private double peso = 0;
	private double altura = 0;
	
	
	/**
	 * 
	 * Constructores de clase para persona, el primero un constructor vacio y el segundo con la introducción de datos por parte del usuario.
	 */
	
	public persona () {
		super();
		this.peso = 0;
		this.altura = 0;
	}
	
	/**
	 * Constructor de la clase persona.
	 * 
	 * @param peso Peso en kilogramos de la persona.
	 * @param altura Altura en centímetros de la persona.
	 */
	public persona(double peso, double altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	
	/* ##################
	 *  Métodos de clase
	 * #################
	 */ 
	
	/**
	 * 
	 * Método para el cálculo del IMC
	 * devuelve un texto según el imc que se ha obtenido en la operación calculada.
	 * @param peso el peso en kg
	 * @param altura la altura en cm que posteriormente pasa a m.
	 * 
	 */
	
	public void calcularIMC(double peso, double altura) {   
			if ((peso > 0 && peso < 200) && (altura > 30 && altura < 250)) {  //Para que el usuario inserte datos acorde a lo normal en las personas.
				double alturaM = (altura/100);  // Calculamos la altura en m para luego hacer el cálculo del imc que es altura al cuadrado.
				double imc = ((peso)/(alturaM*alturaM));  // Cálculo del imc.
				if (imc < 18.5) {  // Si el imc es menor a 17.3
					System.out.println("Tu IMC es " + imc + ". \n ##Estás por debajo del peso normal. ¡Consulta con un médico!## \n");
				}
				else if (imc >= 18.5 && imc <= 24.9) { //Si el imc está entre 18.5 y 24.9 ambos incluidos
					System.out.println("Tu IMC es " + imc + ". \n ## Tienes un peso saludable. ¡Buen trabajo!## \n");
				}
				else System.out.println("Tu IMC es " + imc + ". \n ##Tienes sobrepeso. ¡Cuida tu salud!## \n"); // Para el resto de imc por encima de 24.9
			} 
			else System.out.println("Los datos introducidos no son correctos, el peso es en Kg entre 0 y 200 y la altura en cm entre 30 y 250"); 
			// ELSE para el dar al usuario indicaciones de por que fallan los datos introducidos dándole un rango.
	}
	
	/**
	 * 
	 * @return devuelve la altura y el peso por pantalla.
	 * 
	 */
	@Override  //Método para que imprima los datos por pantalla.
	public String toString() {
		return "peso=" + peso + ", altura=" + altura;
	}
	
	
	/* ###############
	 * Getter y Setter
	 * ############### 
	 */
	
	/**
	 * Obtiene el peso de la persona.
	 * @return El peso en kilogramos.
	 */
	public double getPeso() {
		return peso;
	}
	
	/**
	 * Establece el peso de la persona.
	 * @param peso Nuevo peso en kilogramos.
	 * 
	 */
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	/**
	 * Obtiene la altura de la persona.
	 * @return La altura en centímetros.
	 */
	public double getAltura() {
		return altura;
	}
	
	/**
	 * Establece una nueva altura
	 * @param altura nueva altura en cm
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
}
