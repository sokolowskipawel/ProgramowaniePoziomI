import static java.lang.Math.pow;

public class Zadanie3 {
    public static void main(String[] args) {
        series1(10);
        System.out.println();
        series2(10);
        System.out.println();
        series3(10);
        System.out.println();
        series4(10);

    }

    static void series1(int n) {
        for (int i = 1; i < n * 2; i += 2) {
            System.out.print(i + ", ");
        }
    }

    static void series2(int n) {
        int result = -1;

        for (int i = 0; i < n; i++) {
            System.out.print(result + ", ");
            result = result + (int) pow(2, i + 1);
        }
    }

    static void series3(int n) {
        int result = 2;
        int znak = 1;

        System.out.print(result + ", ");
        for (int i = 0; i < n - 1; i++) {
            result += 2 * znak;
            if (result < 3 || result > 7) {
                znak = znak * (-1);
            }
            System.out.print(result + ", ");
        }
    }

    static void series4(int n) {
        NFibonacci nFibonacci = new NFibonacci();
        for (int i = 1; i <= n; i++) {
            System.out.print(nFibonacci.nElementCalculate(i) + ", ");
        }
    }
}

