package org.generation.italy.christmas;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> listaDesideri = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		int scelta;
		boolean valido = false;
		
		do {
			
			System.out.println("Aggiungi elemento alla lista dei desideri: ");
			scanner.next();
			listaDesideri.add(scanner.nextLine());
				
			System.out.println("La tua lista contiene " + listaDesideri.size() + " desideri");
			
			
			System.out.println("Continuare? (1 per SI o 2 per NO): ");
			scelta = scanner.nextInt();
			
			
			if(scelta == 2) {
				valido = true;
			}
			
			
		} while(valido == false);
		
		
		System.out.println("Ecco la tua lista:");
		System.out.println(listaDesideri);
	
		
		scanner.close();
	}

}
