package application;

import java.util.Scanner;

public class Soma_Vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma, media;
		
		
		System.out.println("Quantos numeros você vai digitar?");
		n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
		System.out.println("Digite um numero: ");
		vect[i] = sc.nextDouble();
		}
		
		soma = 0;
		for (int i=0; i<n; i++) {
			soma = soma + vect[i];
		}
		media = soma/n;
		
		System.out.print("VALORES = ");
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.printf("\nSOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);
		sc.close();

	}

}
