import java.util.Scanner;

class Hello {
    public static void main(String args[]) {
        System.out.println("Hello world!");
        // Strings Declaration
        String name = "Hello";
        String name1 = "Java";
        System.out.println(name);
        System.out.println(name1);

        // Concatenation
        String Name1 = name + name1;
        System.out.println(Name1);
        System.out.println(name1 + name);

        // Length
        System.out.println(name.length());
        System.out.println(name1);

        // charAt
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        // Comaper
        String a = "Hello";
        String b = "Hello";
        // 1 : String 1 > String 2 : + values Enything
        // 2 : String 1 == String 2 : 0
        // 3 : String 1 < String 2 : - values Enything
        // hello bello op : hello (h) is Big

        if (a.compareTo(b) == 0) {
            System.out.println("String are a equal");
        } else {
            System.out.println("String are not equal");
        }

        // Find a Sub String
        System.out.println(name.substring(2, 5));

        // User Input
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine(); // FullLine Strings
        System.out.println(Name);
    }
}