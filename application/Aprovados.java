package application;
import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n;
		String nome;
		double primeira, segunda;
		System.out.println("Quantos alunos serão digitados?");
		n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:" i + 1);
		}
		
		
		sc.close();
	}
}