package Recursion;

public class Recursion {
    public static boolean Sorted(int arry[], int Idx) {
        if (Idx == arry.length - 1) {
            return true;
        }
        if (arry[Idx] >= arry[Idx + 1]) {
            // Array is unSorted
            return false;
        }
        return Sorted(arry, Idx + 1);
    }

    public static void main(String[] args) {
        int arry[] = { 1, 2, 3 };
        System.out.println(Sorted(arry, 0));
    }
}