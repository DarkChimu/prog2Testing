package passwordTesting;

import java.util.Random;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Password p1 = new Password(null, 8);
		
		
		p1.passwordGen(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Longitud de Contraseña")));
		p1.esFuerte();
	
	

	
	}

}
