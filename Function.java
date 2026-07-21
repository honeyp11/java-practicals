public class Function {
    public void Name() {
        System.out.println("Hello Java");
    }

    public void name(String name) // Perameter Type Function
    {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        // Called Function
        Function n = new Function();
        n.Name();
        n.name("Java Programming");
    }
}
