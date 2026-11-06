//
//  Class author: Ryan R
//  Date created: 2026-11-05
//  General description: Prints several patterns using different loops.
//
public class Patterns {

    //
    //  Pre-condition: The program has normal inputs and you dont put a massive block of ascii text
    //  Post-condition: Prints the output from each pattern method.
    //
    public static void main(String[] args) {
        stars(7);
        triangle(9);
        odds(9);
        maxE(6);
        pyramid(5);
    }

    // Method 1 --------------------------------------------
    //
    //  Pre-condition: Rows is a positive integer.
    //  Post-condition: Prints rows of stars incrementing 2 stars per row
    //
    public static void stars(int rows) {
        int line = 1;
        int count = 1;

        while (line <= rows) {
            int star = 1;
            while (star <= count) {
                System.out.print("*");
                star++;
            }
            System.out.println();
            count = count + 2;
            line++;
        }
    }

    // Method 2 --------------------------------------------
    //
    //  Pre-condition: rows is a positive integer.
    //  Post-condition: Prints numbers where the the number printed and amount of times is controlled by the rows
    //
    public static void triangle(int rows) {
        int line = 1;

        while (line <= rows) {
            int number = 0;
            while (number < line) {
                System.out.print(line);
                number++;
            }
            System.out.println();
            line++;
        }
    }

    // Method 3 --------------------------------------------
    //
    //  Pre-condition: Rows is a positive integer.
    //  Post-condition: Repeat of pattern 2 but starts high and decrements by 2 per row
    //
    public static void odds(int rows) {
        int number = rows;
        while (number > 0) {
            // very important odd check :gasp:
            if (number % 2 != 0) {
                int line = 0;
                while (line < number) {
                    System.out.print(number);
                    line++;
                }
                System.out.println();
            }
            number--;
        }
    }

    // Method 4 --------------------------------------------
    //
    //  Pre-condition: Rows is a positive integer.
    //  Post-condition: Prints a sideways EO triangle incrementing 1 per row and stopping at max then decrementing
    //
    public static void maxE(int rows) {
        String output = "E";
        if (rows % 2 != 0) {
            output = "E";
        }
        else {
            output = "O";
        } 
        
        int number = 1;
        boolean decreasing = false;

        while (number > 0) {
            int line = 0;
            while (line < number) {
                if (output.equals("E")) {
                    System.out.print("E");
                } else {
                    System.out.print("O");
                }
                line++;
            }
            System.out.println();
            if (output.equals("E")) {
                output = "O";
            } else {
                output = "E";
            }

            if (number == rows) {
                decreasing = true;
                number--;
            } else if (decreasing) {
                number--;
            } else {
                number++;
            }
        }
    }

    // Method 5 --------------------------------------------
    //
    //  Pre-condition: Rows is a positive integer.
    //  Post-condition: Prints a shrinking upside down pyramid
    //
    public static void pyramid(int rows) {
        int number = 1;
        //second side bs
        int chars = rows * 2 - 1;

        while (number <= rows) {
            int spaces = 0;
            while (spaces < number - 1) {
                System.out.print(" ");
                spaces++;
            }

            int printed = 0;
            while (printed < chars) {
                System.out.print(number);
                printed++;
            }
            System.out.println();
            number++;
            chars -= 2;
        }
    }
}
