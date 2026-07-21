import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        // String Builder
        StringBuilder sb = new StringBuilder("java");
        System.out.println(sb);

        // Set charat index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // insert Element
        sb.insert(0, 'j');
        System.out.println(sb);

        // append
        sb.append(" programming");
        System.out.println(sb);

        // delete
        sb.delete(1, 2);
        System.out.println(sb);

        // length
        System.out.println(sb.length());

        //
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // 5 - 1 - 0 > = 4

            char front1 = sb.charAt(front);
            char back2 = sb.charAt(back);

            sb.setCharAt(front, back2);
            sb.setCharAt(back, front1);
        }
        System.out.println(sb);
    }
}
