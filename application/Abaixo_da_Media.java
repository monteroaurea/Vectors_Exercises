package application;

import java.util.Scanner;

public class Abaixo_da_Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma, media;
		
		System.out.println("Quantos elementos vai ter o vetor ?");
		n = sc.nextInt();
		
		double[] numeros = new double[n];
		
		for(int i=0; i<n; i++) {
		System.out.println("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}
		 
		soma = 0;
		for (int i=0; i<n; i++) {
			soma = soma + numeros[i];
			}
		media = soma/n;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for (int i=0; i<n; i++) {
			if(numeros[i] < media) {
				System.out.printf("%.1f\n", numeros[i]);
			}
		}
			
		
		
		sc.close();
	}

}
