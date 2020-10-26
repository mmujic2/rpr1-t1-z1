package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Dijeljenje {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite prvi broj: ");
		int broj1;
		broj1 = ulaz.nextInt();

		System.out.println("Unesite drugi broj: ");
		int broj2;
		broj2 = ulaz.nextInt();
		System.out.println("Brojevi koji ste unijeli su: " + broj1 + " i " + broj2);
	}
}