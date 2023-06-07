package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program_Products {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//Vetor do tipo Products(name, price) com quantidade n de elementos.
		Products[] vect = new Products[n];
		
		//Lê os produtos, instanciar os objetos e guardar nas posições do vetor:
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Products(name, price);
			
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice(); //para pegar somente o preço do objeto que contem nome e preço
		}
		double avg = sum/vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		
		sc.close();

	}
}
