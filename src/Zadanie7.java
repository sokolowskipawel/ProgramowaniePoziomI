import java.util.Map;

//bankomat wydający zadaną resztę najmniejszą liczba nominałów
public class Zadanie7 {

    private double[] cash = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

    public Map<Double, Integer> calculateCashCount(double value) {

        for (int i = 0; i < cash.length - 1; i++) {
            if (cash[i] <= value){
                int count = (int) (value / cash[i]);
                value -= count * cash[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
    //   private int[] cash = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};
    //   private int[] cents = new int[]{50, 20, 10, 5, 2, 1};

    /*  public int returnCash(double amount) {

          int index = 0;

          while (amount >= 1){
              if (amount >= cash[index]){
                  return cash[index];
              } else {
                  index ++;
              }
          }
          int underOne = (int) (amount * 100);

          index = 0;
          while (underOne > 0){
              if (underOne > cents[index]){
                  return cents[index];
                  underOne -= cents[index];
              } else {
                  index ++;
              }
          }
          return 0;
      }
  */

}
