package jsnacks;

import java.util.Scanner;

public class JSnack5 {
	/*
	 * La distanza di Hamming tra due stringhe di uguale lunghezza è il numero di
	 * posizioni nelle quali i caratteri corrispondenti sono diversi. Chiedi
	 * all'utente di dirti due parole e stampa la distanza di Hamming.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// chiedo all'utente due parole di uguale lunghezza
		System.out.println("Inserisci due parole di uguale lunghezza");
		System.out.print("Parola 1: ");
		String parola1 = scan.nextLine();
		System.out.print("Parola 2: ");
		String parola2 = scan.nextLine();
		// verifico se sono lunghe uguali
		if (parola1.length() == parola2.length()) {
			// dichiaro il contatore per la distanza di Hamming
			int distanzaHamming = 0;
			char[] parola1Array = parola1.toCharArray();
			char[] parola2Array = parola2.toCharArray();
			// itero sugli array di caratteri e li confronto uno ad uno
			for (int i = 0; i < parola1Array.length; i++) {
				if (parola1Array[i] != parola2Array[i]) {
					distanzaHamming++;
				}
			}

			System.out.println("La distanza di Hemming tra le due parole è: " + distanzaHamming);

		} else {
			System.out.println("Le parole sono di lunghezza diversa");
		}

		scan.close();
	}

}
