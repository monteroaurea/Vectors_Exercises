package application;

import java.util.Scanner;

public class Media_Pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double mediaPares;
		int n, somaPares = 0, nPares = 0;
		
		System.out.println("Quantos elementos vai ter no vetor? ");
		n = sc.nextInt();

		int vetor[] = new int[n];

		for (int i=0; i<n; i++) {
			System.out.print("Digite na tela um numero: ");
			vetor[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++) {
			if(vetor[i] % 2 == 0) {
				somaPares = somaPares + vetor[i];
				nPares++;
				}
			}
			if (nPares == 0) {
				System.out.println("NENHUM NUMERO PAR");
			}
			else {
				mediaPares = (double)somaPares/nPares;
				System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
			}
		
		
		
		sc.close();

	}

}