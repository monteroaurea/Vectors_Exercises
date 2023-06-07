package application;

import java.util.Scanner;

public class Numeros_Pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdpares, n;
		
		System.out.println("Quantos numeros você vai digitar: " );
		n = sc.nextInt();
		
		int[] pares = new int[n];
		
		for (int i=0; i<n; i++) {
		System.out.println("Digite um numero: " );
		pares[i] = sc.nextInt();
		}
		System.out.println("\nNUMEROS PARES:");
		
		qtdpares=0;
		for (int i=0; i<n; i++) {
			if(pares[i] % 2 == 0) {
				System.out.printf("%d ", pares[i]);
				qtdpares++;
			}
		}
		System.out.println();
		System.out.printf("QUANTIDADE DE PARES = %d\n", qtdpares);
		sc.close();
		
		
	}

}
