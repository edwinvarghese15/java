import java.util.*;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String s) {
        super(s);
    }
}

public class AverageCalculator {

   
    static double computeAverage(int n) throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            if (num < 0) {
                throw new NegativeNumberException("Negative number entered: " + num);
            }
            sum += num;
        }
        
        return (double) sum / n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the number of integers: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Number of integers must be greater than zero.");
                return;
            }

            double average = computeAverage(n);
            System.out.println("Average = " + average);

        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers only.");
        }
    }
}
