import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//analizujemy plik z ciągami znaków oddzielonymi końcami linii
// sprawdzamy czy znajdują się w nich palindromy

public class Zadanie6 {

    private List<String> readWords = new ArrayList<String>();
    private String filePath;

    public Zadanie6() {
    }

    public Zadanie6(String filePath) {
        this.filePath = filePath;
    }

    public void readFile() throws FileNotFoundException {

        File file = new File(filePath);
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            readWords.add(input.nextLine());
        }
        System.out.println(readWords);
    }

    public boolean isPalindrom(String inputText) {

        for (int iL = 0, iP = inputText.length() - 1; iL < iP; iL++, iP--) {
            if (inputText.charAt(iL) != inputText.charAt(iP)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {

        Zadanie6 zadanie6 = new Zadanie6("src/palindromy.txt");

        zadanie6.readFile();
        for (String analyzedText : zadanie6.readWords) {
            if (zadanie6.isPalindrom(analyzedText)) {
                System.out.println(analyzedText);
            }
        }
    }
}
