package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, multiplo;
		
		
		System.out.println("Introduzca un numero");
		num = sc.nextInt();
		
		num%=7;
		
		multiplo = num==0?num: 7-num;
		
		System.out.println("hay que sumarle "+ (multiplo) + " para que sea multiplo de 7");
		
		sc.close();
	}

}
