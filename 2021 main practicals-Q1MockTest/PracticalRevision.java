public class PracticalRevision {
    public static void main(String[] args) {
        IBIO.output("Aryan Guha");

        int howmany = 0;
        int number = 0;
        int max = 0;
        int min = 0;
        double sum = 0;
        double average = 0;
        int range = 0;
        int flag = 0;
        int m = 0;
        howmany = IBIO.inputInt("Enter howmany numbers you want to process: ");

        if (howmany < 3) {
            IBIO.output("Vaue entered is invalid");
            System.exit(1);
        }

        if (howmany >= 3) {
            for (int i = 0; i < howmany; i++) {
                number = IBIO.inputInt("Enter a number: ");

                if (i == 0) {
                    min = number;
                    max = number;
                }

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

                sum = sum + number;
            }
        }

        average = sum / howmany;
        range = max - min;

        IBIO.output("The maximum number is: " + max);
        IBIO.output("The minimum number is: " + min);
        IBIO.output("The sum number is: " + sum);
        IBIO.output("The average number is: " + average);
        IBIO.output("The range is: " + range);

        m = max / 2; // Math.sqrt(max);

        for (int i = 2; i <= m; i++) {
            if (max % i == 0) {
                IBIO.output(max + " is not prime number");
                flag = 1;
                break;
            }
        }
        
        if (flag == 0) {
            IBIO.output(max + " is prime number");
        }

    }
}

// https://codebeautify.org/javaviewer	
