package principal;

public class Program {
	
	static void mensagem() {
		System.out.println("Primeiro void");
	}
	
	static void mensagem2(double n) {
		System.out.println("O número informado foi: "+n);
	}
	
	static String mensagem3() {
		return "Aqui é minha função de número 3";
	}
	
	static String mensagem4(int x) {
		return "Número informado: "+x;
	}
	
	static void pularLinha() {
		System.out.println();
	}
	
	static String soma(int num1, int num2) {
		//int resultado = num1 + num2;
		return "A soma é: "+(num1+num2);
	}
	
	static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
	static void somarDoisNumeros(int x, int y) {
		System.out.println("O resultado é: "+(x+y));
	}

	public static void main(String[] args) {
		
		mensagem();
		
		pularLinha();
		
		mensagem2(20.54);
		
		pularLinha();
		//O system é usado quando possui um retorno independente do tipo
		System.out.println(mensagem3());
		
		pularLinha();
		
		System.out.println(mensagem4(4));
		
		pularLinha();
		
		System.out.println(soma(10,5));
		
		pularLinha();
		
		System.out.println("O resultado da multiplicação é: "+multiplicar(3,3));
		
		pularLinha();
		
		somarDoisNumeros(15,15);

	}
}
