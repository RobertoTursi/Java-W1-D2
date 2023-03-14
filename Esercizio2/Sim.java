package Esercizio2;

import java.util.Arrays;
import java.util.Scanner;

public class Sim {
	
	int number;
	private double credito;
	Chiamata[] listaChiamate;
	//double credito;
	//String[] listaChiamate;
	
	public Sim(int n) {
		this.number = n;
		credito = 0;
		listaChiamate = Chiamata.getChiamate() ;
	}
	
	public static int getNumber(Sim s) {
		return s.number;
	}
	
	public static double getCredito(Sim s) {
		return s.credito;
	}
	
	public static Chiamata[] getListaChiamate(Sim s) {
		return s.listaChiamate;
	}
	
	public static void stampaDatiSim(Sim s) {
		System.out.println("numero della sim: " + Sim.getNumber(s) + ", credito: " + Sim.getCredito(s) + ", lista chiamate: " + Arrays.deepToString(s.listaChiamate));
	}
	
	//chiamate
	
	
}
