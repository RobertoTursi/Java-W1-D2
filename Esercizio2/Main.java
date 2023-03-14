package Esercizio2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Sim sim1 = new Sim(12345);
		System.out.println(Sim.getNumber(sim1));
		Sim.stampaDatiSim(sim1);
	}

}
