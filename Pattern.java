public class Pattern {
    public static void main(String[] args) {
        int i, j;
        System.out.println("Solid Rectangle");
        // outer for loop ( Row )
        for (i = 1; i <= 4; i++) {
            // inner for loop ( Colume )
            for (j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            // next line
            System.out.println();
        }

        System.out.println("Hollow Rectangle");
        // outer for loop
        for (i = 1; i <= 4; i++) {
            // inner for loop
            for (j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Half pyramid");
        // outer for loop
        for (i = 1; i <= 4; i++) {
            // inner for loop
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Inverted Half pyramid");
        // outer for loop
        for (i = 4; i >= 1; i--) {
            // inner for loop
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Inverted Half Pyramid 180 Deg");
        // outer for loop
        for (i = 1; i <= 4; i++) {
            // inner for loop
            for (j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            // inner for loop
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Half pyramid with Number");
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Inverted Half pyramid with Number");
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        int k = 1;
        System.out.println("Floyd's Tringle");
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }

        System.out.println("0 1 Tringle");
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print(1 + " "); // even (0 2 4 6 8 )
                } else {
                    System.out.print(0 + " "); // odd (1 3 5 7 9 )
                }
            }
            System.out.println();
        }
    }
}