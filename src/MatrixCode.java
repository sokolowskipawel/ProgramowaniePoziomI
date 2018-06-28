import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//szyfr macierzowy - text wejściowy zapisywany jest w macierzy kwadratowej
// następnie odczytywany jest kolumnami
// bez urzycia macierzy

public class MatrixCode {

    private String encrypted;

    public String getEncrypted() {
        return encrypted;
    }

    public String encryptMatrixCode(String inputText) {

        StringBuilder encryptText = new StringBuilder();
        double sqrtTextLenght = sqrt(inputText.length());
        int matrixSize;

        if (sqrtTextLenght == (int) sqrtTextLenght) {
            matrixSize = (int) sqrtTextLenght;
        } else {
            matrixSize = (int) sqrtTextLenght + 1;
        }
        for (int i = 0; i < matrixSize; i++) {
            for (int j = i; j < pow(matrixSize, 2); j = j + matrixSize) {
                if (j < inputText.length()) {
                    encryptText.append(inputText.charAt(j));
                } else {
                    encryptText.append(" ");
                }
            }
        }
        encrypted = encryptText.toString().trim();
        return encrypted;
    }

    public String decryptMatrixCode(String inputText) {
        return encryptMatrixCode(inputText);
    }

    public static void main(String[] args) {

        MatrixCode matrixCode = new MatrixCode();
        String encryptText = matrixCode.encryptMatrixCode("KURS PROGRAMOWANIA W JAVIE");

        System.out.println("Tekst po zaszyfrowaniu: " + encryptText);
        System.out.println("Długość tekstu po zaszyfrowaniu: " + encryptText.length());
        String decryptText = matrixCode.decryptMatrixCode(encryptText);
        System.out.println("Odszyfrowany text: " + decryptText);
        System.out.println("Długość odszyfrowanego textu: " + decryptText.length());
    }
}
