import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read non-negative integers
        System.out.print("Enter the first non-negative integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second non-negative integer: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third non-negative integer: ");
        int num3 = sc.nextInt();

        // Find the maximum value among the numbers
        int max = Math.max(Math.max(num1, num2), num3);

        // Print the histogram
        for (int i = max; i > 0; i--) {
            if (i <= num1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            if (i <= num2) {
                System.out.print(" *");
            } else {
                System.out.print("  ");
            }

            if (i <= num3) {
                System.out.print(" *");
            } else {
                System.out.print("  ");
            }

            System.out.println();
        }
    }
}


// Program was tested on https://www.online-java.com/ and worked ok :)
// https://drive.google.com/file/d/1Ytvtx3KxS3ac7Wbw1znT-r7PPtjkvO9B/view?usp=drive_link