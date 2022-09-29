package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {

    public static void main(String[] args) {
        calculateSum(4567);
        calculateSum(1111);
    }

    public static void calculateSum(int number) {


        if (number < 10) {
            System.out.println(number);
        } else if ((number < 100)) {
            int tens = number / 10;
            int unity = number % 10;
            System.out.println(tens + unity);
        } else if ((number < 1000)) {
            int oneHundred = number /100;
            int tens = (number / 10)%10;
            int unity = number % 10;

            System.out.println(oneHundred + tens + unity);
        } else if ((number < 10000)) {
            int thousand = number / 1000;
            int oneHundred =  (number % 1000)/100;
            int tens = (number / 10)%10;
            int unity = number % 10;

            System.out.println(thousand + oneHundred + tens + unity);
        }


    }
}
