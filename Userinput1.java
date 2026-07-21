public class Userinput1 {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        if ( a % 2 == 0){
            System.out.println("No is Even " + a);
        }
        else{
            System.out.println("No is Odd " + a);
        }
    }
}
