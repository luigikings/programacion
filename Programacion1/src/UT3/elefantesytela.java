/**
 * 
 */
package UT3;

import java.util.Scanner;
/**
 * @author LuisDaSilva
 *
 */
public class elefantes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Datos
		Scanner sc = new Scanner(System.in);
		int tela;
		int i;
		int suma = 0;
		int elefante;
		
		//pregunto cuanto aguanta la tela
		System.out.println("¿Cuanto Aguanta la tela?");
		tela = sc.nextInt(); 
		
		for (i = 1; suma <= tela; i++) {
			System.out.println("¿Cuanto pesa el elefante numero "+i);
			elefante = sc.nextInt();
			suma = suma + elefante;
				
		}
		if (elefante == 0) {
			System.out.println("La tela aguanta");
		}
		if (elefante != 0) {
			System.out.println("No aguanta mas");
		}
	
		

	}

}
