package passwordTesting;

import java.util.Random;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Password {

	public static final int contLongitudDefault = 8;
	public int contLongitud;
	boolean isStrong = false;
	public String cont;
	
	
	
	public void passwordGen () {
		
		if (contLongitud == 0) 
		{
		cont = new Random().ints(contLongitudDefault, 33, 122).mapToObj(i -> String.valueOf((char)i)).collect(Collectors.joining());
		}
		else
		{
			cont = new Random().ints(contLongitud, 33, 122).mapToObj(i -> String.valueOf((char)i)).collect(Collectors.joining());
		}
		
	}
	
	public void esFuerte() {
		int upperCase=0;
		int lowerCase=0;
		int numberCase=0;
		for (int k = 0; k < cont.length(); k++) {
		       
		       if (Character.isUpperCase(cont.charAt(k))) upperCase++;

		       if (Character.isLowerCase(cont.charAt(k))) lowerCase++;
		       
		       if (Character.isDigit(cont.charAt(k))) numberCase++;
		       
		      }
		
		if (upperCase >= 2 && lowerCase >= 1 && numberCase >= 5) 
	       {
	    	   isStrong = true;
	    	   System.out.println("la contraseña: "+cont+", Es fuerte");
	       }
		else {
			   System.out.println("la contraseña: "+cont+", No es fuerte");
	    	 }
	}
	
	public boolean isStrong() {
		return isStrong;
	}

	public void setStrong(boolean isStrong) {
		this.isStrong = isStrong;
	}

	public int getContLongitud() {
		return contLongitud;
	}


	public void setContLongitud(int contLongitud) {
		this.contLongitud = contLongitud;
	}


	public String getCont() {
		return cont;
	}


	public void setCont(String cont) {
		this.cont = cont;
	}
	
	
	
}



/*Profe David Prog II Dugarte, [02.07.20 21:42]
Haz una clase llamada Password que siga las siguientes condiciones:

    Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.

    Los constructores serán los siguiente:
        Un constructor por defecto.
    Un constructor con la longitud que nosotros le pasemos. Generara una contraseña aleatoria con esa longitud.

    Los métodos que implementa serán:
        esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
        generarPassword():  genera la contraseña del objeto con la longitud que tenga.
        Método get para contraseña y longitud.
        Método set para longitud.

Ahora, crea una clase clase ejecutable:

    Crea un array de Passwords con el tamaño que tu le indiques por teclado.
    Crea un bucle que cree un objeto para cada posición del array.
    Indica también por teclado la longitud de los Passwords (antes de bucle).
    Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
    Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato:

contraseña1 valor_booleano1

contraseña2 valor_bololeano2

*/
