package principal;

import java.util.Scanner;

public class Soma {
	
	static String soma(int soma) {
		return "O resultado da soma é: "+soma;
	}

	public static void main(String[] args) {
		
		int soma = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		int[] numeros = new int[3];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Informe os números aqui: ");
			numeros[i] = entrada.nextInt();
			
			soma = soma + numeros[i];
		}
		
		System.out.println(soma(soma));
		
		entrada.close();
	}

}
