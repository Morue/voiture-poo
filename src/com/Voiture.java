package com;

public class Voiture {
		
	private String marque;
	private int vitesse = 0;
	private int setPuissance = 0;
	private static int count = 0;
	
	public Voiture () {
	count = count + 1;
	}	
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public int getPuissance() {
		return setPuissance;
	}

	public void setPuissance(int puissance) {
		this.setPuissance = puissance;
	}

	public static int getCount() {
		return Voiture.count;
	}

	public static void setCount(int count) {
		Voiture.count = count;
	}

	@Override 
    public String toString() {
        return String.format( "Marque : " + this.marque + " Vitesse : " + this.vitesse + " Puissance : " + this.setPuissance );
    }
}