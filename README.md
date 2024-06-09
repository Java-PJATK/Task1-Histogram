# Task1-Histogram  

https://github.com/Java-PJATK/Task1-Histogram/blob/main/ppj01E.pdf  

March 8, 2024  

Deadline: Mar 18 (inclusive)

# Task 1  

Write a program which reads from the user three non-negative integers and then prints, using symbols ’*’, a ‘histogram’ of the data represented by the numbers, i.e., three vertical bars, aligned at the bottom, with heights equal to the values of the three numbers.  

For example, for numbers 3, 1 and 8 the result should look like this:  

```
  *
  *
  *
  *
  *
* *
* *
***
```
  
Do not use arrays, strings or any other kind of collections.  

## Solution

```java
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
```

https://drive.google.com/file/d/1Ytvtx3KxS3ac7Wbw1znT-r7PPtjkvO9B/view?usp=drive_link

[Contents](https://github.com/Java-PJATK/00.Contents)
