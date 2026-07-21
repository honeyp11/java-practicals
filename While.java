public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 5) {
            System.out.println("Hello World!"); // op Hello World! * 5
            i++;
        }

        int j = 0;
        while (j <= 10) {
            System.out.println(j); // op 0 to 10
            j++;
        }

        int k = 0;
        do {
            System.out.println("Hello World"); // op Hello World * 5
            k++;
        } while (k < 5);

        int l = 0;
        do {
            System.out.println(l);
            l++;
        } while (l <= 10);
    }
}
