package algoritmo;

/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/

import java.io.IOException;

import java.util.Scanner;

public class algoritmo2 {

	public static void main(String[]agr)throws IOException {

		
		Scanner leia = new Scanner(System.in);

		float media1, media2, media3, mediaFinal;

		int p1 = 2;

		int p2 = 3;

		int p3 = 5;		

		System.out.println("Digite media1");

		media1=leia.nextFloat();
		
		System.out.println("Digite media2");

		media2=leia.nextFloat();
		
		System.out.println("Digite media3");

		media3=leia.nextFloat();
	
		media1 = media1 * p1;

		media2 = media2 * p2;

		media3 = media3 * p3;

		mediaFinal = (media1 + media2 + media3) / (p1+p2+p3);

		System.out.println("Media Final: " + mediaFinal);
		
	}


	}

