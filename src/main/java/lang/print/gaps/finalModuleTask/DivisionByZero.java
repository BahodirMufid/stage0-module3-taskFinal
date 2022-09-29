package lang.print.gaps.finalModuleTask;

public class DivisionByZero {
    public static void main(String[] args)  {
        int number = 10;
        try {
            System.out.println(number / 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Divided by zero operation cannot possible");
        }
    }
}
