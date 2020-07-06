package passwordTesting;

import java.util.Random;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Password {

	public static final int contLongitudDefault = 8;
	public int contLongitud;
	public String cont;
	
	
	
	
	
	public Password (String _cont, int _contLongitud) {
		cont = _cont;
		contLongitud = _contLongitud;
	}
	
	
	public void passwordGen (int contLongitud) {
		if (contLongitud == 0) 
		{
		cont = new Random().ints(contLongitudDefault, 33, 122).mapToObj(i -> String.valueOf((char)i)).collect(Collectors.joining());
		}
		else
		{
			cont = new Random().ints(contLongitud, 33, 122).mapToObj(i -> String.valueOf((char)i)).collect(Collectors.joining());
		}
		
		//System.out.println(cont);
	}
	
	public void esFuerte() {
		boolean isStrong = false;
		int upperCase=0;
		int lowerCase=0;
		int numberCase=0;
		for (int k = 0; k < cont.length(); k++) {
		       
		       if (Character.isUpperCase(cont.charAt(k))) upperCase++;

		       if (Character.isLowerCase(cont.charAt(k))) lowerCase++;
		       
		       if (Character.isDigit(cont.charAt(k))) numberCase++;
		       
		      }
		
		if (upperCase > 2 && lowerCase > 1 && numberCase > 5) 
	       {
	    	   isStrong = true;
	    	   JOptionPane.showMessageDialog(null, "la contrase�a: "+cont+", No es fuerte");
	       }
		else {
		       JOptionPane.showMessageDialog(null, "la contrase�a: "+cont+", No es fuerte");
	    	 }
	}
	
	
	
}



/*Profe David Prog II Dugarte, [02.07.20 21:42]
Haz una clase llamada Password que siga las siguientes condiciones:

    Que tenga los atributos longitud y contrase�a . Por defecto, la longitud sera de 8.

    Los constructores ser�n los siguiente:
        Un constructor por defecto.
    Un constructor con la longitud que nosotros le pasemos. Generara una contrase�a aleatoria con esa longitud.

    Los m�todos que implementa ser�n:
        esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 may�sculas, mas de 1 min�scula y mas de 5 n�meros.
        generarPassword():  genera la contrase�a del objeto con la longitud que tenga.
        M�todo get para contrase�a y longitud.
        M�todo set para longitud.

Ahora, crea una clase clase ejecutable:

    Crea un array de Passwords con el tama�o que tu le indiques por teclado.
    Crea un bucle que cree un objeto para cada posici�n del array.
    Indica tambi�n por teclado la longitud de los Passwords (antes de bucle).
    Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
    Al final, muestra la contrase�a y si es o no fuerte (usa el bucle anterior). Usa este simple formato:

contrase�a1 valor_booleano1

contrase�a2 valor_bololeano2

*/
