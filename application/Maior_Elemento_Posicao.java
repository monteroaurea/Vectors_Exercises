package application;

import java.util.Locale;
import java.util.Scanner;

public class Maior_Elemento_Posicao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double maior;
		int n, posicao;
		
		System.out.print("Quantos numeros você vai digitar? ");
		n = sc.nextInt();
		
		double[] reais = new double[n];
		
		for (int i=0; i<n; i++) {
		System.out.println("Digite um numero: ");
		reais[i] = sc.nextDouble();
		
		}
		
		maior = reais[0];
		posicao = 0;
		
		for (int i=1; i<n; i++) {
			if (reais[i] > maior) {
				maior = reais[i];
				posicao = i;
			}
		}
		
		
		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);
		
		
		sc.close();

	}
}
