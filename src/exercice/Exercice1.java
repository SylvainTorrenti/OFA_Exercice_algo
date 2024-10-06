package exercice;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		
		System.out.println("Donnez un premier nombre.");
		Scanner in = new Scanner(System.in);
		int nb1 = in.nextInt();
		
		System.out.println("Donnez un second nombre.");
		int nb2 = in.nextInt();
		
		int somme=nb1 +nb2;
		System.out.println("La somme des deux nombres est de : " + somme);
	}

}
