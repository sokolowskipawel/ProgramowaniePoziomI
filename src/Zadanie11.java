// wyszukiwanie najdłuższego wspólnego ciągu w dwóch ciągach znaków
public class Zadanie11 {

    private String a;
    private String commonText;

    public String findCommonText(String text1, String text2){

        String textCommon = text2;

        if (text1.length() < text2.length()){
            text2 = text1;
            text1 = textCommon;
            textCommon = text2;
        }

        int beginIndex = 0;
        int endIndex = text2.length();

        while (endIndex <= text1.length()){
            if (isTheSameTexts(text1.substring(beginIndex, endIndex), textCommon)){
                return textCommon;
            }
            beginIndex ++;
            endIndex ++;
        }

        return null;
    }

    boolean isTheSameTexts(String text1, String text2){
        if (text1.equals(text2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        Zadanie11 zadanie11 = new Zadanie11();

        System.out.println(zadanie11.findCommonText("AAABBA", "ABAAABBAAA"));

    }
}
