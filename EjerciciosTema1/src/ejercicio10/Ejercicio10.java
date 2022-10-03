package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double longitudM, longitudCM;
		
		System.out.println("Introduzca la longitud en metros del lanzamiento");
		longitudM = sc.nextDouble();
		
		longitudCM = longitudM*100;
		
		System.out.println("La longitud es " +longitudCM);
		
		sc.close();
	}

}
