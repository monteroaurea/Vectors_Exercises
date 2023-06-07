package application;

import java.util.Scanner;

public class Soma_Vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Quantos valores terão em cada vetor? ");
		n = sc.nextInt();

		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];

		System.out.println("Digite os valores do vetor: A");
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor: B");
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}

		System.out.println("Resultado da soma dos valores dos vetores A e B: ");
		for (int i = 0; i < n; i++) {
			C[i] = A[i] + B[i];
			System.out.println(C[i]);
		}

		sc.close();
	}

}
