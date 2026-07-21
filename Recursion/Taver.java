package Recursion;

public class Taver {
    public static void TaverH(int n, String Src, String Helper, String Dest) {
        if (n == 0) {

            return;
        }
        TaverH(n - 1, Src, Dest, Helper);
        System.out.println("Transfer Disk " + n + " from " + Src + " to " + Dest);
        TaverH(n - 1, Helper, Src, Dest);
    }

    public static void main(String aegs[]) {
        int n = 3;
        TaverH(n, "S", "H", "D");
    }
}