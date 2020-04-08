import java.util.ArrayList;

public class YearTemp {

    int year;
    private MonthTemp[] monthsT;
    public static final int MONTHS_IN_YEAR = 12;
    private int maxTemp;
    private int minTemp;


//    private ArrayList<MonthTemp> maxTemp;
//    private ArrayList<MonthTemp> minTemp;

    public YearTemp(int year, int jan, int feb, int mar, int apr, int may,
                    int jun, int jul, int aug, int sep, int oct, int nov, int dec) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        int[] temps = { jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec };
        this.year = year;
        this.monthsT = new MonthTemp[MONTHS_IN_YEAR];
        for (int i = 0; i < MONTHS_IN_YEAR; i++){
            monthsT[i] = new MonthTemp(months[i],temps[i]);
        }


        // set maxTemp
            maxTemp = monthsT[0].getTemperature();
        for (int month = 0; month < MONTHS_IN_YEAR; month++){
            if (monthsT[month].getTemperature() > maxTemp) { maxTemp = monthsT[month].getTemperature(); }
        }
        // set minTemp
        minTemp = monthsT[0].getTemperature();
        for (int month = 0; month < MONTHS_IN_YEAR; month++){
            if (monthsT[month].getTemperature() < minTemp) { minTemp = monthsT[month].getTemperature(); }

        }

        // find maximum and minimum temperature in the year
//        int maxT = 0; //index of max temp in the year
//        int minT = 0; //index of min temp in the year
//        for (int month = 0; month < MONTHS_IN_YEAR; month++) {
//            if(monthsT[month].getTemperature() > monthsT[maxT].getTemperature())
//                maxT = month;
//            if(monthsT[month].getTemperature() < monthsT[minT].getTemperature())
//                minT = month;
//        }


//        maxTemp = new ArrayList<MonthTemp>(0);
//        minTemp = new ArrayList<MonthTemp>(0);
//        // find month's that their temp is max and min (in case that there are more than one with same temp
//        for (int month = 0; month < MONTHS_IN_YEAR; month++) {
//            if (monthsT[month].getTemperature() == monthsT[maxT].getTemperature())
//                maxTemp.add(monthsT[month]);
//            if (monthsT[month].getTemperature() == monthsT[minT].getTemperature())
//                minTemp.add(monthsT[month]);
        }


//
//    public void setMaxTemp(ArrayList<MonthTemp> maxTemp) {
//        this.maxTemp = maxTemp;
//    }
//
//    public ArrayList<MonthTemp> getMinTemp() {
//        return minTemp;
//    }
//
//    public void setMinTemp(ArrayList<MonthTemp> minTemp) {
//        this.minTemp = minTemp;
//    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MonthTemp[] getMonthT() {
        return monthsT;
    }

    public void setMonthT(MonthTemp[] monthT) {
        this.monthsT = monthT;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }
}
