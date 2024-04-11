import java.util.Scanner;

public class TrianglePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the triangle: ");
        int numRows = scanner.nextInt();

        printTriangle(numRows);

        scanner.close();
    }

    // Function to print a triangle pattern
    public static void printTriangle(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
           System.out.println();
            // Move to the next line
       
        }
    }
}

		
	