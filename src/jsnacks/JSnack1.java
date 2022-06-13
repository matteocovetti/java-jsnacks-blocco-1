package jsnacks;

import java.util.Scanner;

public class JSnack1 {

	/*Il software deve chiedere per 5 volte all’utente di inserire un numero.
	 * Il programma stampa la somma di tutti i numeri inseriti.
	 * Esegui questo programma in due versioni, con il for e con il while.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int somma = 0;
		
//		for(int i = 0; i < 5 ; i++) {
//			System.out.println("Dammi un numero: ");
//			somma = somma + scan.nextInt();
//		}
		
		int counter = 0;
		
		while (counter < 5) {
			System.out.println("Dammi un numero: ");
			somma = somma + scan.nextInt();
			counter++;
		} 
		
		System.out.println("La somma totale è: " + somma);
		scan.close();
	}

}
