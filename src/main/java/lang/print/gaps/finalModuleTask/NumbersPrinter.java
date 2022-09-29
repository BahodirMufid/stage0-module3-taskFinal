package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {

    public static void main(String[] args) {

        printIsPositive(921);
    }
    public static void printIsPositive(int number) {

        boolean positive = number >= 1 ? true : number < 1 ? false : number==0 ?false:true;

        System.out.println(positive);

    }
}
