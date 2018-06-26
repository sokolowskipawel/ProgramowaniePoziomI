// algorytm wyszukujacy wszystkie wystąpienia wzorca w ciągu znaków

import java.util.ArrayList;
import java.util.List;

public class Zadanie9 {

    private String analyzedText;
    private String pattern;
    private List<Appearance> apparances = new ArrayList<Appearance>();

    public Zadanie9() {
    }

    public Zadanie9(String analyzedText, String pattern) {
        this.analyzedText = analyzedText;
        this.pattern = pattern;
    }

    public List<Appearance> findPattern() {

        int index = 0;
        int indexEnd = pattern.length();

        while (index < analyzedText.length() - pattern.length()) {
            if (pattern.equals(analyzedText.substring(index, indexEnd))) {
                apparances.add(new Appearance(index, indexEnd - 1));
                index += pattern.length();
                indexEnd = index + pattern.length();
            } else {
                index++;
                indexEnd++;
            }
        }
        return apparances;
    }

    public static void main(String[] args) {

        Zadanie9 zadanie9 = new Zadanie9("BCACCAABCBCACAA", "CAC");
        List<Appearance> appearances = new ArrayList<Appearance>();

        appearances = zadanie9.findPattern();

        System.out.print("[");
        for (Appearance apperance : appearances) {
            System.out.print(apperance.toString());
        }
        System.out.println("]");
    }
}
