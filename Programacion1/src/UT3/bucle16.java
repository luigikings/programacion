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
		int n1;
		int n2;
		do { 
			System.out.println("Escriba numero de Inicio");
			n1 = sc.nextInt();
			System.out.println("Escriba numero de Final");
			n2 = sc.nextInt();
		} 
		while (n2 < n1);
		System.out.println("Escriba numero de Intervalos");
		int intervalo = sc.nextInt();
		
	
		
		for(int i = n1; i<=n2; i=i+intervalo){
			System.out.print(i + " ");
		}

	}

}
