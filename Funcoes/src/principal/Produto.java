package principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Produto {
	
	static double preco(double valorProduto,double lucroProduto) {
		double lucro = lucroProduto / 100;
		double resultado = valorProduto * lucro + valorProduto;
		return resultado;
	}

	public static void main(String[] args) {
		
		double valorProduto;
		double lucroProduto;
		
		Scanner entrada = new Scanner(System.in);
		
		DecimalFormat formatador = new DecimalFormat("00.00");
		
		System.out.println("Informe o valor do produto: ");
		valorProduto = entrada.nextDouble();
		
		System.out.println("Informe o valor do acréscimo: ");
		lucroProduto = entrada.nextDouble();
		
		System.out.println("O produto será vendido por: "+formatador.format(preco(valorProduto,lucroProduto))+" reais.");
		
		entrada.close();
	}

}
