package esercizio1;

public class Rettangolo {
	int h;
	int b;
	public Rettangolo(int a, int b2) {
		this.h = a;
		this.b = b2;
	}
	
	
	public int getPerimetro() {
		return (h+b)*2;
	}
	
	public int getArea() {
		return h*b;
	}
	
	public static int sommaPerimetro(Rettangolo r1, Rettangolo r2) {
		return r1.getPerimetro()+r2.getPerimetro();
	}
	
	public static int sommaArea(Rettangolo r1, Rettangolo r2) {
		return r1.getArea()+r2.getArea();
	}
	
	public static String stampaRettangolo(Rettangolo r) {
		return "Il perimetro è: " + r.getPerimetro() + ", l'area è:" + r.getArea();
		
	}
	public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
		System.out.println(Rettangolo.stampaRettangolo(r1));
		System.out.println(Rettangolo.stampaRettangolo(r2));
		System.out.println("La somma dei perimetri dei due rettangoli è: " + Rettangolo.sommaPerimetro(r1, r2) + ", la somma delle aree dei due rettangoli è: " + Rettangolo.sommaArea(r1, r2));
	}
}
