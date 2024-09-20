public class Main {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number) {
        // Check if number is negative. If so return -1
        if (number < 0) {
            System.out.println("Invalid value");
        } else {
            for (int i = 1; i <= number; i++) {
                // check if number mod i is 0
                // If so print it use System.out.print() not System.out.println().  Don't forget a space between
                // If not don't do anything
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }


    }

}