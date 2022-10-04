package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		double ml, cm, m;
		
		//Pedimos al usuario que introduzca la cantidad de milimetros, centimetros, metros
		System.out.println("introduzca un numero de milimetros");
		ml = sc.nextDouble();
		System.out.println("introduzca un numero de centimetros");
		cm = sc.nextDouble();
		System.out.println("introduzca un numero de metros");
		m = sc.nextDouble();
		
		//Aqui pasamos todo a centimetros y lo sumamos todo
		ml /=10;
		m *=100;
		cm = cm+ml+m;
		
		//Mostramos el resultado
		System.out.println("la suma de todo da "+ cm+ "cm");
		
		sc.close();
	}

}
