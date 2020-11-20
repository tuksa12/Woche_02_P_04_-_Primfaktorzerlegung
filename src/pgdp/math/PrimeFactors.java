package pgdp.math;

import static pgdp.MiniJava.*;

public class PrimeFactors {
	public static void main(String[] args) {
		int n = readInt("Bitte Zahl eingeben:");
		int divisor = 2;

		if (n <= 1) {
			writeLineConsole("Fehler: n>1 erwartet!");}
		else
			while (n >1){
				if (n % divisor == 0){
					writeConsole(divisor);
					n = n/divisor;
						if (n!=1)
							writeConsole(" ");}
				else
					divisor++;
			}
			writeLineConsole();
	}
}
