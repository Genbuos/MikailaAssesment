package question9;

public class ExpirationDate  {
    private String month;
    private String day;
    private String year;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }




    @Override
    public String toString() {
        return "ExpirationDate{" +
                "month='" + month + '\'' +
                ", day='" + day + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
