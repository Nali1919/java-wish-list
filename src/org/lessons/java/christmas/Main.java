package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String regalo = "";
		Scanner s = new Scanner(System.in);
		ArrayList<String> elencoRegali = new ArrayList<>();

		do {
			System.out.println("Inserisci regalo o fermati");
			regalo = s.nextLine();

			if (!regalo.equals("fermati")) {
				elencoRegali.add(regalo);
			}
		    System.out.println("Ecco la lunghezza della lista attuale: " + elencoRegali.size());

		} while (!regalo.equals("fermati"));
		Collections.sort(elencoRegali);
		System.out.println("I regali sono:");
		for (String regali : elencoRegali) {

			
			System.out.println(regali);

		}

	}
}
