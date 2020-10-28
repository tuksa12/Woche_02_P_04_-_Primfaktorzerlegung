package pgdp.math;

import static pgdp.MiniJava.*;

public class PrimeFactors {
	public static void main(String[] args) {
		int n = readInt("Bitte Zahl eingeben:");

		if (n <= 1) {
			writeConsole("Fehler: n>1 erwartet!");
		}
	}
}
