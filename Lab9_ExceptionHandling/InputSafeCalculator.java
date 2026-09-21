package Lab9_ExceptionHandling;

public class InputSafeCalculator {
    public static String calculateRatio(String num1Str, String num2Str) {
        try {
            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);
            int result = num1 / num2;
            return String.valueOf(result);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error: " + e.getClass().getSimpleName());
            return "Error: Invalid operation.";
        } finally {
            System.out.println("Cleanup complete: Ratio calculation finished.");
        }
    }
    public static void main(String[] args) {
        System.out.println(calculateRatio("10", "2"));
        System.out.println(calculateRatio("ten", "2"));
        System.out.println(calculateRatio("10", "0"));
    }
}
