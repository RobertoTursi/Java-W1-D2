package esercizio1;

public class Main {
	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo(10, 25);
		Rettangolo r2 = new Rettangolo(3, 43);
		
		System.out.println(Rettangolo.stampaRettangolo(r1));
		Rettangolo.stampaDueRettangoli(r1, r2);
	}
}
