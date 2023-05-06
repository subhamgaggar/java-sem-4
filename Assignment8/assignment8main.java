package sem4_java;

public class assignment8main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No input provided. Please provide an integer as input.");
            return;
        }

        for (int i = 0; i < args.length; i++) {
            try {
                int n = Integer.parseInt(args[i]);
                if (n < 1 || n > 20) {
                    throw new FactorialException("Input must be between 1 and 20.", n);
                }

                int result = factorialCalculation(n);
                System.out.println("Factorial of " + n + " is: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Input:"+args[i]+" Error: Input must be an integer.");
            } catch (FactorialException e) {
                System.out.println(e);
            }
        }

    }
    public static int factorialCalculation(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial=factorial*i;
        }
        return factorial;
    }
}





