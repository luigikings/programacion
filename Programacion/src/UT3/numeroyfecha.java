/**
 * 
 */
package UT3;
import java.util.Scanner; 

/**
 * @author LuisDaSilva
 *
 */
public class numeroyfecha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Datos
	Scanner sc = new Scanner(System.in);
	int dia;
	int mes;
	int a�o;
	int salir;
	
	//Pido a�o,mes y dia
	do {
		System.out.println("Hola, por favor introduzca los numeros correspondientes a la fecha");
		System.out.println("Inserte a�o");
		a�o = sc.nextInt();
		
		System.out.println("Inserte mes");
		mes = sc.nextInt();
		
		System.out.println("Inserte dia");
		dia = sc.nextInt();
		
		//condicional de a�o entre 1000 y 3000
		if (a�o>=1000 && a�o<=3000){
			//condicional de mes entre 1 y 12
			if (mes>=1 && mes<=12) {
				//condicional de dia entre 1 y 31
				if (dia<1 && dia>31) {
					System.out.println("formato incorrecto");
				}
				//En caso de que sea febrero max dia 28
				else if (mes==2 && dia>=29) {
					System.out.println("formato incorrecto");
				}
				//En caso de que el mes tenga 30 dias
				else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia==31){
					System.out.println("formato incorrecto");
				}
				//Mostrar fecha
				else {
					System.out.printf("Su fecha es: %d/%d/%d\n", a�o, mes, dia);
				}
			}
			else {
				System.out.println("formato incorrecto");
			}
		} 
		else {
			System.out.println("formato incorrecto");
		}
		System.out.println("Si desea volver a introducir una fecha presione 1 y si desea salir introduzca cualquier numero");
		salir = sc.nextInt();
	}
	while (salir==1);
	
	}
	

}
