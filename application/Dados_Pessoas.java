package application;

import java.util.Locale;
import java.util.Scanner;

public class Dados_Pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, m, f;
		double menor, maior, mediaF, totalF;

		System.out.println("Quantas pessoas serão digitadas?");
		n = sc.nextInt();

		double[] alturas = new double[n];
		char[] generos = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			generos[i] = sc.next().charAt(0);
		}

		menor = alturas[0];
		maior = alturas[0];

		for (int i = 1; i < n; i++) {
			if (alturas[i] > maior) {
				maior = alturas[i];
			}
			if (alturas[i] < menor) {
				menor = alturas[i];
			}
		}

		m = 0;
		f = 0;
		totalF = 0;

		for (int i = 0; i < n; i++) {
			if (generos[i] == 'M') {
				m++;
			} else {
				f++;
				totalF = totalF + alturas[i];
			}
		}

		mediaF = totalF / f;
		
		System.out.printf("Menor altura = %.2f\n", menor);
		System.out.printf("Maior altura = %.2f\n", maior);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaF);
		System.out.printf("Numero de homens = %d\n", m);

		sc.close();

	}
}