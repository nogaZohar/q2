import java.time.Month;

public class Data {
    private YearTemp[] yearT;

    public Data() {
        YearTemp y1 = new YearTemp(2014, 15, 13, 15, 21, 25, 29, 30,
                29, 25, 25, 19, 18 );
        YearTemp y2 = new YearTemp(2015, 12, 12, 15, 22, 26, 28, 30,
                32, 23, 21, 20, 16 );
        YearTemp y3 = new YearTemp(20, 10, 10, 17, 23, 24, 29, 30,
                30, 25, 22, 18, 17 );
        YearTemp y4 = new YearTemp(2016, 14, 12, 19, 24, 25, 29, 30,
                30, 22, 20, 20, 15 );
        YearTemp y5 = new YearTemp(2017, 13, 11, 18, 25, 26, 29, 30,
                29, 21, 20, 18, 15 );
        YearTemp y6 = new YearTemp(2018, 12, 14, 17, 25, 27, 29, 31,
                31, 24, 25, 21, 16 );
        this.yearT = new YearTemp[] {y1, y2, y3, y4, y5, y6};
    }


    //getters and setters
    public YearTemp[] getYearT() {
        return yearT;
    }

    public void setYearT(YearTemp[] yearT) {
        this.yearT = yearT;
    }


}


