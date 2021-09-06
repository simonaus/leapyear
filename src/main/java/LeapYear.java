public class LeapYear {
    public boolean isLeapYear(int year) {
        boolean isDivisibleByFour = year % 4 == 0;
        boolean isNotDivisibleByOneHundred = year % 100 != 0;
        boolean isDivisibleByFourHundred = year % 400 == 0;

        return ((isDivisibleByFour && isNotDivisibleByOneHundred) || isDivisibleByFourHundred);
    }
}
