import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

// wyszukanie wszystkich liczb pierwszych z zadanego przedziału <2, n> z wykorzystaniem sita Eratostenesa.
// następnie zapisanie do pliku o nazwie prime-numbers.txt.

public class EratosthenesSieve {
    private boolean[] sieve;

    public EratosthenesSieve(int n) {

        sieve = new boolean[n - 1];
        for (int i = 0; i < n - 1; i++) {
            sieve[i] = true;
        }
    }

    public EratosthenesSieve() {
    }

    public void eratosthenesSieveCalculate() {

        int k = (int) sqrt(sieve.length);

        for (int i = 0; i < k; i++) {
            if (sieve[i] == true) {
                int jump = i + 2;
                for (int j = (int) pow(i + 2, 2); j < sieve.length + 2; j = j + jump) {
                    sieve[j - 2] = false;
                }
            }
        }
    }

    @Override
    public String toString() {

        String out = "";

        for (int i = 0; i < sieve.length; i++) {
            if (sieve[i] == true) {
                out = out + (i + 2) + ",";
            }
        }
        return out;
    }

    public static void main(String[] args) throws IOException {

        EratosthenesSieve eratosthenesSieve = new EratosthenesSieve(25);

        eratosthenesSieve.eratosthenesSieveCalculate();

        PrintWriter file = new PrintWriter("prime-numbers.txt");

        file.print(eratosthenesSieve.toString());
        file.close();
    }
}
