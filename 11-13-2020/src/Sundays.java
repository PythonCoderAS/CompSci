public class Sundays {
    /**
     * Gets the number of Sundays in a month, give the day of the week that it started.
     */
    public static int doMonth(int startingDay){
        int count = 0;
        for (int i=0; i < 31; i++){
            if (startingDay == 0){
                count++;
            }
            startingDay = (startingDay + 1) % 7;
        }
        if (startingDay == 0){
            count++;
        }
        return count;
    }

    /**
     * Gets the starting day for the next year.
     */
    public static int dayOfWeekInNextYear(int year, int startingDay){
        int nextYear = year+ 1;
        if (nextYear % 4 == 0 && (nextYear % 100 != 0 || nextYear % 400 == 0)){
            return (startingDay + 366) % 7;
        } else {
            return (startingDay + 365) % 7;
        }
    }

    public static void main(String[] args) {
        int count = 0;
        int year = 1901;
        int targetYear = 2000;
        int startingDayOfWeek = 2;
        for (int i=year; i <= targetYear; i++){
            count += doMonth(startingDayOfWeek);
            startingDayOfWeek = dayOfWeekInNextYear(i, startingDayOfWeek);
        }
        System.out.println("The century had " + count + " Sundays in the first month of every year!");
    }
}
