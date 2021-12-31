public class CalendarDate extends Date implements Comparable<CalendarDate> {
    private int year;

    public CalendarDate(int year, int month, int day){
        super(month, day);
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String toString(){
        return year + "/" + super.toString();
    }

    public void nextDay(){
        super.nextDay();
        if (getMonth() == 1 && getDay() == 1){
            year++;
        }
    }

    public int compareTo(CalendarDate obj){
        if (year == obj.getYear()){
            if (getMonth() == obj.getMonth()){
                return getDay() - obj.getDay();
            } else {
                return getMonth() - obj.getMonth();
            }
        } else {
            return year - obj.getYear();
        }
    }
}