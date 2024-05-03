package javadivisions;

import java.util.Scanner;

public class JavaDivisions {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int contador = 0, dividendo, divisor;

		System.out.println("Favor de introducir dividendo");
		dividendo = scan.nextInt();

		System.out.println("Favor de introducir divisor");
		divisor = scan.nextInt();

		dividendo = dividendo - divisor;

		while (dividendo >= 0) {
			contador = contador + 1;
			dividendo = dividendo - divisor;
		}
		System.out.println("La division es igual a: " + contador);
	}

}
