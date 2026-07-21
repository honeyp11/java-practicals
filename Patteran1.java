public class Patteran1 {
    public static void main(String[] args) {
        int i, j;
        int n = 4;
        System.out.println("Butterfly Pattern");
        // Upper Half
        for (i = 1; i <= n; i++) {
            // 1st part
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // 2nd part
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (i = n; i >= 1; i--) {
            // 1st part
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // 2nd part
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Solid Rhombus");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Number Pyramid");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Palindromic pattern");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 1st Half
            for (j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // 2nd Half
            for (j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Diamond pattern");
        // Upper Half
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}