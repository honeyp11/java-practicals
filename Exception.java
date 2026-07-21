public class Exception {
    public static void main(String[] args) {
        int a1 = 5, b = 5, C ;
        try{
            C = a1/b;
        try {
            int a[] =new int[5];
            a[7] = 20/4;
        try{
            String s = null;
            System.out.println(s.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException");
        }
    }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
        catch ( ArithmeticException e) 
        {
            System.out.println("Arithmetic Exception");
        }

        System.out.println("Program is a Multiple Try Block and Multiple Catch Block Exception");
    }
}
