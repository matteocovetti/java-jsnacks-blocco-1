package jsnacks;

import java.util.Random;

public class JSnack3 {
	// Generatore di “nomi cognomi” casuali: prendendo una lista di nomi e una
	// lista di cognomi, genera una falsa lista di 3 invitati.

	public static void main(String[] args) {
		Random rand = new Random();

		String[] nomi = { "Matteo", "Francesco", "Giuseppe", "Simone", "Alessio" };
		String[] cognomi = { "Rossi", "Bianchi", "Neri", "Verdi", "Covetti" };

//		String PrimoInvitato = nomi[rand.nextInt(nomi.length)] + " " + cognomi[rand.nextInt(cognomi.length)];
//		String SecondoInvitato = nomi[rand.nextInt(nomi.length)] + " " + cognomi[rand.nextInt(cognomi.length)];
//		String TerzoInvitato = nomi[rand.nextInt(nomi.length)] + " " + cognomi[rand.nextInt(cognomi.length)];
//		System.out.println("I tre invitati sono: ");
//		System.out.println(PrimoInvitato);
//		System.out.println(SecondoInvitato);
//		System.out.println(TerzoInvitato);

		// live coding

		String[] fake = new String[3];

		for (int i = 0; i < fake.length; i++) {
			// creo un indice casuale tra 0 e la lunghezza dell'array nomi
			int index = rand.nextInt(nomi.length);
			// prendo l'elemento dell'array nomi
			String nomeCasule = nomi[index];
			// creo un indice casuale tra 0 e la lunghezza dell'array cognomi
			index = rand.nextInt(cognomi.length);
			// prendo l'elemento dell'array cognomi
			String cognomeCasuale = cognomi[index];

			// metto il nome fake alla posizione corrente
			fake[i] = nomeCasule + " " + cognomeCasuale;
			System.out.println(fake[i]);
		}

	}

}
