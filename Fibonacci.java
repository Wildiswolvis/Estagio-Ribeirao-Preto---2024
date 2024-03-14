import java.util.Scanner;
public class Fibonacci {
	public static boolean verificarFibonacci(int numero) {
		int a = 0;
		int b = 1;
		while(b < numero) {
			int temp = b;
			b = a + b;
			a = temp;
		}
		return b == numero;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número qualquer ");
		int numero = sc.nextInt();
		
		if (verificarFibonacci(numero)) {
			System.out.println("O número " + numero + " pertence à sequência de Fibonacci");
		} else {
			System.out.println("O número " + numero + " não pertence à sequência de Fibonacci");
		}
		
		sc.close();

	}

}
