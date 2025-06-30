package OperatorsDemo;

public class BitwiseDemo {
    public static void main(String[] args) {
        char t = 'T';
        char u = 'U';
        System.out.println(t&u);
        System.out.println(t|u);
        System.out.println(t^u);

        boolean b = true;
        boolean c = false;
        System.out.println(b&c);
        System.out.println(b|c);
        System.out.println(b^c);
        System.out.println(!b);
        System.out.println(!c);

        int i1 = 10;
        int i2 = -15;
        System.out.println(~i1);
        System.out.println(~i2);
    }
}
