public class Equation1 {
    public static void main(String args[])
    { 
        int a = 2;
        int b  = 3;
        int c  = 2;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        double z = ((b*b-4*a*c)/2*a);
        System.out.println("Eqution is " + z);
    }
}
