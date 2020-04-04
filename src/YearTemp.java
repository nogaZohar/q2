import java.util.ArrayList;

public class YearTemp {

    int year;
    private MonthTemp[] monthT;
    private final int MONTHS_IN_YEAR = 12;
    private ArrayList<MonthTemp> maxTemp;
    private ArrayList<MonthTemp> minTemp;

    public YearTemp(int year, double jan, double feb, double mar, double apr, double may,
                    double jun, double jul, double aug, double sep, double oct, double nov, double dec) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        Double[] temps = { jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec };
        this.year = year;
        MonthTemp[] monthsT = new MonthTemp[MONTHS_IN_YEAR];
        for (int i = 0; i < MONTHS_IN_YEAR; i++){
            monthsT[i] = new MonthTemp(months[i],temps[i]);
        }

        // find maximum and minimum temperature in the year
        int maxT = 0; //index of max temp in the year
        int minT = 0; //index of min temp in the year
        for (int month = 0; month < MONTHS_IN_YEAR; month++) {
            if(monthsT[month].getTemperature() > monthsT[maxT].getTemperature())
                maxT = month;
            if(monthsT[month].getTemperature() < monthsT[minT].getTemperature())
                minT = month;
        }

        maxTemp = new ArrayList<MonthTemp>(0);
        minTemp = new ArrayList<MonthTemp>(0);
        // find month's that their temp if max and min (in case that there are more than one with same temp
        for (int month = 0; month < MONTHS_IN_YEAR; month++) {
            if (monthT[month].getTemperature() == monthT[maxT].getTemperature())
                maxTemp.add(monthT[month]);
            if (monthT[month].getTemperature() == monthT[minT].getTemperature())
                minTemp.add(monthT[month]);
        }

    }


    public void setMaxTemp(ArrayList<MonthTemp> maxTemp) {
        this.maxTemp = maxTemp;
    }

    public ArrayList<MonthTemp> getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(ArrayList<MonthTemp> minTemp) {
        this.minTemp = minTemp;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MonthTemp[] getMonthT() {
        return monthT;
    }

    public void setMonthT(MonthTemp[] monthT) {
        this.monthT = monthT;
    }

    public ArrayList<MonthTemp> getMaxTemp() {
        return maxTemp;
    }
}
