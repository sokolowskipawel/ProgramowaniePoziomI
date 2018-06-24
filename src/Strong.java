public class Strong {

    public static void main(String[] args) {

        Strong strong = new Strong();

        System.out.println(strong.calculateStrong(5));
        strong.calculateStrongItereacja(5);
    }


    public int calculateStrong(int n) {
        if (n == 2) {
            return 2;
        } else {
            return n * calculateStrong(n - 1);
        }
    }

    public void calculateStrongItereacja(int n) {
        int result = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        } else {
            result = n;
        }
        System.out.println(result);
    }

}
