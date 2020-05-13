package ejercicioP2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EJ_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
			float num1, num2, resSum, resRe,resM,resDiv;
			
			System.out.println("Digite Primer termino");
			
			num1 = lector.nextFloat();
			
			do {		
				System.out.println("Digite Segundo termino");
				num2 = lector.nextFloat();
				if (num2 == 0)
					System.out.println("\nNo se puede divir entre 0!\n");
			}while(num2 == 0);
			
			resSum = num1 + num2;
			resRe = num1 - num2;
			resM = num1 * num2;
			resDiv = num1 / num2;
			
			/*try {
				if (resDiv == Float.POSITIVE_INFINITY)
					throw new ArithmeticException();
			}catch (ArithmeticException ae) {
				System.out.println("Error Aritmetico! No puede dividir entre 0");
			}*/
			
			System.out.println("\nResultado de la suma: "+resSum);
			System.out.println("Resultado de la resta: "+resRe);
			System.out.println("Resultado de la multiplicacion: "+resM);
			System.out.println("Resultado de la Division: "+resDiv);
			
			
			
		
	}

}
