public class Main {
    public static void main(String[] args) {
        //checking year divisible by 4, 100 and 400
        boolean l = LeapYearCalculator.isLeapYear(1200);
        System.out.println(l);
        //checking year divisible by 4 and 100
        l = LeapYearCalculator.isLeapYear(1100);
        System.out.println(l);
        //checking year divisible by < 1 or > 9999
        l = LeapYearCalculator.isLeapYear(123454);
        System.out.println(l);


    }
}
