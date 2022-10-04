package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables para este ejercicio
		double longitudM, longitudCM;
		
		//Le pedimos al usuario que introduzca un numero y usamos el escaner para darle ese valor a la variable
		System.out.println("Introduzca la longitud en metros del lanzamiento");
		longitudM = sc.nextDouble();
		
		//Pasamos de metros a centimetros
		longitudCM = longitudM*100;
		
		//Mostramos la lungitud redondeada a cm
		System.out.println("La longitud es " +(int)longitudCM+ "cm");
		
		sc.close();
	}

}
