/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author LuisDaSilva
 *
 */
public class bucle16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba numero de Inicio");
		int n1 = sc.nextInt();
		System.out.println("Escriba numero de Final");
		int n2 = sc.nextInt();
		System.out.println("Escriba numero de Intervalos");
		int intervalo = sc.nextInt();
		
		if (n2<n1) {
			int intercambio;
			intercambio = n2;
			n2 = n1;
			n1 = intercambio;
		} else;
		
		for(int i = n1; i<=n2; i=i+intervalo){
			System.out.print(i + " ");
		}
		
		

	}

}
