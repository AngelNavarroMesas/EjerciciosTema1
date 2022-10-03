package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double ml, cm, m;
		
		System.out.println("introduzca un numero de milimetros");
		ml = sc.nextDouble();
		System.out.println("introduzca un numero de centimetros");
		cm = sc.nextDouble();
		System.out.println("introduzca un numero de metros");
		m = sc.nextDouble();
		
		ml /=10;
		m *=100;
		
		cm = cm+ml+m;
		
		System.out.println("la suma de todo da "+ cm+ "cm");
		
		sc.close();
	}

}
