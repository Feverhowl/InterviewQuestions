import java.math.BigDecimal;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Вычисление Факториала:");
        System.out.println(" ");
        System.out.println(factorial(-10));
        System.out.println(factorial(0));
        System.out.println(factorial(4));
        System.out.println(factorial(151));
    }

    private static String factorial(int n) {
        if (n < 0) return "0";
        else if (n == 0) return "1";
        else if (n > 150) return "Слишком большое число!";
        else {
            BigDecimal fact = new BigDecimal(1);
            for (int i = 1; i <= n; i++) {
                fact = fact.multiply(BigDecimal.valueOf(i));
            }
            return "" + fact;
        }
    }
}