import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("HEllo World!"); // op HEllo World! * 10
        }

        System.out.println("1 to 10 Number");

        for (i = 0; i <= 10; i++) {
            System.out.println(i); // op 1 to 10
        }

        System.out.println("User input ");

        Scanner sc = new Scanner(System.in); // user input
        int n = sc.nextInt(); // integer value
        int sum = 0;
        for (i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum); // op sum of uesr value 3(1+2+3) = 6

        Scanner Sc = new Scanner(System.in);
        int m = Sc.nextInt();

        System.out.println("Table of " + m);

        for (i = 1; i <= 10; i++) {
            System.out.println(m + " * " + i + " = " + i * m); // op Table
        }
    }
}