package Esercizio2;

import java.util.Arrays;
import java.util.Scanner;

public class Chiamata {
	static Scanner s = new Scanner(System.in);
	int numero; 
	double minuti;
	
	public Chiamata(int n, double min) {
		this.numero = n;
		this.minuti = min;
	}
	
	public static Chiamata[] getChiamate() {	
		Chiamata[] chiamate = new Chiamata[5];
		int[] singolaChiamata = new int[2];
		
		System.out.println("Inserisci prima chiamata");
		singolaChiamata[0] = s.nextInt();
		System.out.println("Inserisci la durata della prima chiamata");
		singolaChiamata[1] = s.nextInt();
		Object chiamata1 = new Object[singolaChiamata[0], singolaChiamata[1]];
		
		System.out.println("Inserisci seconda chiamata");
		singolaChiamata[0] = s.nextInt();
		System.out.println("Inserisci la durata della seconda chiamata");
		singolaChiamata[1] = s.nextInt();
		Chiamata chiamata2 = new Chiamata(singolaChiamata[0], singolaChiamata[1]);
		
		System.out.println("Inserisci terza chiamata");
		singolaChiamata[0] = s.nextInt();
		System.out.println("Inserisci la durata della terza chiamata");
		singolaChiamata[1] = s.nextInt();
		Chiamata chiamata3 = new Chiamata(singolaChiamata[0], singolaChiamata[1]);
		
		System.out.println("Inserisci quarta chiamata");
		singolaChiamata[0] = s.nextInt();
		System.out.println("Inserisci la durata della quarta chiamata");
		singolaChiamata[1] = s.nextInt();
		Chiamata chiamata4 = new Chiamata(singolaChiamata[0], singolaChiamata[1]);
		
		System.out.println("Inserisci quinta chiamata");
		singolaChiamata[0] = s.nextInt();
		System.out.println("Inserisci la durata della quinta chiamata");
		singolaChiamata[1] = s.nextInt();
		Chiamata chiamata5 = new Chiamata(singolaChiamata[0], singolaChiamata[1]);
		
		chiamate[0] = chiamata1;
		chiamate[1] = chiamata2;
		chiamate[2] = chiamata3;
		chiamate[3] = chiamata4;
		chiamate[4] = chiamata5;
		

		return chiamate;
	}
}
