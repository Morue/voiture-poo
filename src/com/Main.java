package com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Voiture voiture1 = new Voiture ();
		voiture1.setMarque("BMW");
		voiture1.setVitesse (50);
		voiture1.setPuissance (3);
		System.out.print( voiture1 );
		
		Voiture voiture2 = new Voiture ();
		voiture2.setMarque ("Peugeot");
		voiture2.setVitesse (60);
		voiture2.setPuissance (2);
		System.out.print("\n" + voiture2 );
		
		Voiture voiture3 = new Voiture ();
		voiture3.setMarque ("Audi");
		voiture3.setVitesse (70);
		voiture3.setPuissance (4);
		System.out.print("\n" + voiture3 );
		
		System.out.print("\nIl y a " + Voiture.getCount() + " voitures ");

		
		Voiture[] voitures = {voiture1 ,voiture2,voiture3} ;
		for(int i =0;i<voitures.length;i++) {
			System.out.print("\n" + voitures[i].toString()); 
		}
				
		
	}
}
