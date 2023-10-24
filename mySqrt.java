public class mySqrt {
        public static double mySqrt(double x) {
            if (x < 0) {
                System.out.println("Square root is not defined for negative numbers.");
            }

            if (x == 0) {
                return 0;
            }

            double guess = x;
            while (true) {
                double nextGuess = 0.5 * (guess + x / guess);
                if (nextGuess == guess) {
                    return nextGuess;
                }
                guess = nextGuess;
            }
        }

        public static void main(String[] args) {
            double number = 50;
            double result = mySqrt(number);
            System.out.printf("The square root of %.6f is approximately %.6f%n", number, result);
        }
    }


