public class Object {
    int a = 20 , b = 20 , c ;
    void add()
    {
        c = a + b;
        System.out.println("Add is " + c);
    }
    void sub()
    {
        c = a - b;
        System.out.println("Sub is " + c);
    }
    void malti()
    {
        c = a * b;
        System.out.println("Malti is " + c);
    }
    void div()
    {
        c = a / b;
        System.out.println("Div is " + c);
    }
    public static void main(String[] args) {
        Object aa = new Object();
        aa.add();
        aa.sub();
        aa.malti();
        aa.div();
    }

}

