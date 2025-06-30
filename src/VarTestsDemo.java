public class VarTestsDemo {
    int x = 10;              // Instance variable
    static int y = 15;       // Static variable


    public static void main(String[] args) {
        VarTestsDemo clsRef = new VarTestsDemo();
        System.out.println(clsRef.x);     // prints 10
        System.out.println(y);           // prints 15
        System.out.println(VarTestsDemo.y); // prints 15

        clsRef.method1(); // method calling
    }

    public void method1() {
        System.out.println(x);          // prints 10
        System.out.println(y);          // prints 15
    }
}
