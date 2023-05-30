package principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Valor {

	double dolar;
	double valor;

	static double dolar(double valor, double dolar) {
		double resultado = valor * dolar;
		return resultado;
	}

	static double real(double real, double cotacao) {
		double resultado = real / cotacao;
		return resultado;
	}
	
	static void pularLinha() {
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		DecimalFormat formatador = new DecimalFormat("00.00");

		char opcao;

		pularLinha();
		System.out.println("Escolha uma op��o abaixo");
		System.out.println("1 - Dolar em Real");
		System.out.println("2 - Real em dolar");
		opcao = entrada.nextLine().charAt(0);
		
		pularLinha();

		if (opcao == '1') {
			System.out.println("Informe cota��o do dolar: ");
			double dolar = entrada.nextDouble();

			System.out.println("Informe o valor em dolares: ");
			double valor = entrada.nextDouble();

			System.out.println("O valor em real � de: " + formatador.format(dolar(valor, dolar))+" reais.");
		} else if (opcao == '2') {
			System.out.println("Informe o valor em real: ");
			double real = entrada.nextDouble();

			System.out.println("Informe a cota��o do dolar: ");
			double cotacao = entrada.nextDouble();

			System.out.println("O valor em dolares � de: " + formatador.format(real(real, cotacao))+" dolares.");
		} else {
			System.err.println("Op��o Inv�lida!");
		}

		entrada.close();

	}

}
