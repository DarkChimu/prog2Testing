package passwordTesting;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Password p1 = new Password();
		int arrayLongitud;
		
        arrayLongitud = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de contraseñas a generar")));
		p1.setContLongitud(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Longitud de Contraseña")));
		
		
		
		String[] array = new String[arrayLongitud];
		Boolean[] fuerte = new Boolean[arrayLongitud];
		for (int i = 0; i < arrayLongitud; i++) {
			p1.passwordGen();
			p1.esFuerte();
			array[i] = p1.getCont();
			fuerte[i] = p1.isStrong();
		}
		
		JOptionPane.showMessageDialog(null, array);
		//JOptionPane.showMessageDialog(null, fuerte);
		
		
		
		
		
		
		
		
		

		
	
	

	
	}

}
