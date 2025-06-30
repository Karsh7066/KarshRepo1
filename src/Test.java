import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void m1(int...i) {
        System.out.println("Var args method");

    }
    public static void main(String[] args) {
        Test t= new Test();
        t.m1(10);
        t.m1(10,20,30);

        ChildTest1.method1();
        ChildTest2 ct2 = new ChildTest2();
        ct2.method2();
    }
}

class ChildTest1 extends Test{
    public static void method1(){
        System.out.println("Hi i am the child class - 1");
    }
}

class ChildTest2 extends Test{
    public void method2(){
        System.out.println("Hi i am the child class - 2");
        System.out.println(10.0/0);
        System.out.println(-10.0/0);
        System.out.println(0.0/0);
    }
}


