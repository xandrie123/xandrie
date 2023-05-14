import java.util.Scanner;
import java.util.function.Function;

public class RiemannSumProgram {
    
    public static double integrate(Function<Double, Double> f, double a, double b, int n) {
        double delta_x = (b - a) / n;
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double x_i = a + i * delta_x;
            sum += f.apply(x_i) * delta_x;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Riemann Sum Program!");
        
        // Prompt the user to enter the function to integrate
        System.out.print("Enter the function to integrate (use 'x' as the variable): ");
        String functionStr = input.nextLine();
        Function<Double, Double> f;
        f = (Double x) -> {
            try {
                return Double.valueOf(functionStr.replaceAll("x", x + ""));
            } catch (NumberFormatException e) {
                return Double.NaN;
            }
        };
        
        // Prompt the user to enter the lower and upper limits of integration
        System.out.print("Enter the lower limit of integration: ");
        double a = input.nextDouble();
        System.out.print("Enter the upper limit of integration: ");
        double b = input.nextDouble();
        
        // Prompt the user to enter the number of subintervals to use
        System.out.print("Enter the number of subintervals to use: ");
        int n = input.nextInt();
        
        // Compute the approximate value of the integral using Riemann sum
        double result = integrate(f, a, b, n);
        
        // Display the result to the user
        System.out.println("The approximate value of the integral of " + functionStr + " from " + a + " to " + b + " using " + n + " subintervals is: " + result);
    }
}
}
