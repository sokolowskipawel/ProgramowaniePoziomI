
// implementacja szyfru Cezra z przesunięciem SHIFT

public class Zadanie8 {
    final int SHIFT = 3 ;
    final char SPACE = ' ';

    public String encryption(String input) {
        String output = input;
        char[] inputChar = input.toCharArray();

        for (int i = 0; i < inputChar.length; i++) {
            if (inputChar[i] != SPACE && inputChar[i] < 91 - SHIFT) {
                int znak = (int) inputChar[i] + SHIFT;
                inputChar[i] = (char) znak;
            } else if (inputChar[i] >= 91 - SHIFT) {
                int znak = (int) inputChar[i] - 26 + SHIFT;
                inputChar[i] = (char) znak;
            }
        }
        output = new String(inputChar);
        return output;
    }

    public String decryption(String input) {
        String output = input;
        char[] inputChar = input.toCharArray();

        for (int i = 0; i < inputChar.length; i++) {
            if (inputChar[i] >= 65 + SHIFT) {
                int znak = (int) inputChar[i] - SHIFT;
                inputChar[i] = (char) znak;
            } else if (inputChar[i] != SPACE && inputChar[i] < 65 + SHIFT) {
                int znak = (int) inputChar[i] + 26 - SHIFT;
                inputChar[i] = (char) znak;
            }
        }
        output = new String(inputChar);
        return output;
    }

    public static void main(String[] args) {

        Zadanie8 zadanie8 = new Zadanie8();

        System.out.println(zadanie8.encryption("KURS PROGRAMOWANIA W JAVIE"));
        System.out.println(zadanie8.decryption(zadanie8.encryption("KURS PROGRAMOWANIA W JAVIE")));
    }
}
