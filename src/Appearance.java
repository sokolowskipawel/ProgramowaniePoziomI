
// klasa przechowuje początkową i końcową pozycję wystąpienia wzorca w ciągu znaków
public class Appearance {
    private int beginIndex;
    private int endIndex;
    private String text;

    public Appearance() {
    }

    public Appearance(int beginIndex, int endIndex) {
        this.beginIndex = beginIndex;
        this.endIndex = endIndex;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "{" + beginIndex + ", " + endIndex + '}';
    }
}
