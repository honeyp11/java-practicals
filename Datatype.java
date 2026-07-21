public class Datatype {
    public static void main(String[] args) {
        // Datatype
        int a = 30;
        System.out.println(a);
        float b = 30.35f;
        System.out.println(b);
        double c = 10.999d;
        System.out.println(c);
        char d = 'J';
        System.out.println(d);
        boolean e = true;
        System.out.println(e);

        System.out.println(a + b + c);
        System.out.println(a - b - c);
        System.out.println(a * b * c);
        System.out.println(a / b);
        System.out.println(b / c);
        System.out.println(c / a);
        System.out.println(a % b);

        // Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        // Create integer variables
        int length = 4;
        int width = 6;
        int area;

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);
    }
}