package jsnacks;

import java.util.Random;

public class JSnack3 {
	// Generatore di “nomi cognomi” casuali: prendendo una lista di nomi e una
	// lista di cognomi, genera una falsa lista di 3 invitati.

	public static void main(String[] args) {
		Random rand = new Random();
		
		String[] nomi = {"Matteo","Francesco","Giuseppe","Simone","Alessio"};
		String[] cognomi = {"Rossi","Bianchi","Neri","Verdi","Covetti"};
		
		String PrimoInvitato = nomi[rand.nextInt(nomi.length)] + " " + cognomi[rand.nextInt(cognomi.length)];
		String SecondoInvitato = nomi[rand.nextInt(nomi.length)] + " " + cognomi[rand.nextInt(cognomi.length)];
		String TerzoInvitato = nomi[rand.nextInt(nomi.length)] + " " + cognomi[rand.nextInt(cognomi.length)];
		System.out.println("I tre invitati sono: ");
		System.out.println(PrimoInvitato);
		System.out.println(SecondoInvitato);
		System.out.println(TerzoInvitato);

	}

}
