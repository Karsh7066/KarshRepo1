package FlowControlDemo;

public class SelectionSwitchDemo {
    public static void main(String[] args) {
        byte b = 10;
        switch (b+1){
            case 11:
                System.out.println("10");
            case 100:
                System.out.println("100");
            case 1000:
                System.out.println("1000");
        }

        int x = 0;
        switch (x)
        {
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
            default:
                System.out.println("def");
        }


        
    }
}
