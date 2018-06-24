import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie5 {

    private List<Integer> readNumers = new ArrayList<Integer>();
    private String filePath;

    public Zadanie5(String filePath) {
        this.filePath = filePath;
    }

    public void readFile() throws FileNotFoundException {

        File file = new File(filePath);
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            readNumers.add(input.nextInt());
        }
        System.out.println(readNumers);
    }

    public void sumPreviusElements() {

        int sum = 0;

        for (Integer number : readNumers) {
            sum += number.intValue();
            System.out.println(sum);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        Zadanie5 zadanieTest = new Zadanie5("src/liczby.txt");  //ścieszka względna
        try {
            zadanieTest.readFile();
        } catch (FileNotFoundException e) {
        }
        zadanieTest.sumPreviusElements();
    }
}
