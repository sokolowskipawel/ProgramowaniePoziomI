// wyszukiwanie najdłuższego wspólnego ciągu w dwóch ciągach znaków do poprawy
public class Zadanie11 {

    private String a;
    private String commonText;

    public String findCommonText(String text1, String text2) {

        String textCommon = text2;

        if (text1.length() < text2.length()) {
            text2 = text1;
            text1 = textCommon;
            textCommon = text2;
        }
        while (textCommon.length() > 0) {
            if (text1.contains(textCommon)) {
                commonText = textCommon;
                return commonText;
            }
            if (text1.contains(textCommon.substring(1))) {
                commonText = textCommon.substring(1);
                return commonText;
            }
            if (text1.contains(textCommon.substring(0, textCommon.length() - 1))) {
                commonText = textCommon.substring(0, textCommon.length() - 1);
                return commonText;
            }
            textCommon = textCommon.substring(1, textCommon.length() - 1);
        }
        return commonText;
    }

    public static void main(String[] args) {

        Zadanie11 zadanie11 = new Zadanie11();

        System.out.println(zadanie11.findCommonText("AAABBA", "ABAABBAAA"));

    }
}
