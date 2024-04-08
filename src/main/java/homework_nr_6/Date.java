package homework_nr_6;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >=1 && day <= 31){
            this.day = day;
        }
        else {
            System.out.println("Invalid day value");
            this.day = 0;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12 ){
            this.month = month;
        }
        else {
            System.out.println("Invalid month value");
            this.month = 0;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 2024) {
            System.out.println("Invalid year value");
            this.year = 0;
        }
        else {
            this.year = year;
        }
    }

    public void displayDate(){
        System.out.println(day + "/" + month + "/" + year);
    }
    public static void main(String[] args) {
        Date date1 = new Date(29,3,2023);
        date1.displayDate();
        Date date2 = new Date(12,14,2023);
        date2.displayDate();
        Date date3 = new Date(35,3,2023);
        date3.displayDate();
        Date date4 = new Date(29,3,2026);
        date4.displayDate();
    }
}
