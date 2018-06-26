// wyszukanie wszystkich palindromów w tekście

import java.util.ArrayList;
import java.util.List;

public class Zadanie10 {

    private String analyzedText;
    private List<String> palindroms = new ArrayList<String>();

    public Zadanie10() {
    }

    public Zadanie10(String analyzedText) {
        this.analyzedText = analyzedText;
    }

    public boolean isPalindrom(String inputText) {
        for (int iL = 0, iP = inputText.length() - 1; iL < iP; iL++, iP--) {
            if (inputText.charAt(iL) != inputText.charAt(iP)) {
                return false;
            }
        }
        return true;
    }

    public String getAnalyzedText() {
        return analyzedText;
    }

    public void addPalindrom(String text) {
        this.palindroms.add(text);
    }

    public List<String> getPalindroms() {
        return palindroms;
    }

    public static void main(String[] args) {
        Zadanie10 zadanie10= new Zadanie10("BCACCAABCB");
        int startIndex = 0;
        String text = zadanie10.getAnalyzedText();

        while (startIndex < text.length()){
            for (int index = startIndex +2 ; index <= text.length(); index ++){
                if (zadanie10.isPalindrom(text.substring(startIndex, index))){
                    zadanie10.addPalindrom(text.substring(startIndex, index));
                }
            }
            startIndex ++;
        }
        for (String palindrom: zadanie10.getPalindroms()) {
            System.out.println(palindrom);
        }

    }
}
