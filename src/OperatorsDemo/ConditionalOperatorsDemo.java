package OperatorsDemo;

public class ConditionalOperatorsDemo {
    public static void main(String[] args) {
        int a=10, b=20;

        int x = (a>b) ? 40:50;
        System.out.println("The value of x: " + x);

        int max = (a > b) ? a : b;
        System.out.println("Maximum is " + max);

        int x2 =  (a>b) ? 30 :((40>50) ? 60:70);
        System.out.println("The value of x2: " + x2);
    }
}
