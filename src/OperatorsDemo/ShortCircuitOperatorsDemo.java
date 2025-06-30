package OperatorsDemo;

public class ShortCircuitOperatorsDemo {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;

        System.out.println("&& operator results are: ");
        if (++x>10 && ++y<15){
            ++x;
            System.out.println(x);
        }
        else {
            ++y;
            System.out.println(y);
        }
        System.out.println(x+"               "+y);


        // || Operator
        int a = 10;
        int b = 15;

        System.out.println("|| operator results are: ");

        if (++a>10 || ++b<15){
            ++a;
            System.out.println(a);
        }
        else {
            ++b;
            System.out.println(b);
        }
        System.out.println(a+"               "+b);

    }
}
