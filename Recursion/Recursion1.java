package Recursion;

public class Recursion1 {
    public static int first = -1;
    public static int last = -1;

    public static void occurance(String str, int idx, char element) {
        // first andd last element to index number find
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char cuurentchar = str.charAt(idx);
        if (cuurentchar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        occurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        // a is first to 0 index and last to a 14 index for string
        String str = "abaacdeafaahaaa";
        occurance(str, 0, 'a');
    }
}
