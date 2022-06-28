public class Main {
    public static void main(String[] args) {
        //checking year divisible by 4, 100 and 400
        boolean isDivisibleByFourAndOneHundredAndFourHundred = LeapYearCalculator.isLeapYear(1200);
        System.out.println(isDivisibleByFourAndOneHundredAndFourHundred);
        //checking year divisible by 4 and 100
        boolean isDivisibleByFourAndFourHundred = LeapYearCalculator.isLeapYear(1100);
        System.out.println(isDivisibleByFourAndFourHundred);
        //checking if year is between 1 and 9999
        boolean isWithinRange = LeapYearCalculator.isLeapYear(123454);
        System.out.println(isWithinRange);


    }
}
