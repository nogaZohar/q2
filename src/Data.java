import java.time.Month;

public class Data {
    private YearTemp[] yearT;

    public Data() {
        yearT = new YearTemp[6];
        yearT[0] = new YearTemp(2014, 15.3, 13.1, 15.2, 21.4, 25.6, 29.9, 30.0,
                29.8, 25.4, 25.0, 19.0, 18.4 );
        yearT[1] = new YearTemp(2014, 12.2, 12.2, 15.9, 22.4, 26.0, 28.9, 30.1,
                32.0, 23.4, 21.0, 20.0, 16.4 );
        yearT[2] = new YearTemp(2014, 10.7, 10.9, 17.9, 23.4, 24.2, 29.7, 30.2,
                30.5, 25.0, 22.2, 18.9, 17.2 );
        yearT[3] = new YearTemp(2014, 14.0, 12.1, 19.0, 24.4, 25.3, 29.7, 30.3,
                30.6, 22.0, 20.8, 20.1, 15.3 );
        yearT[4] = new YearTemp(2014, 13.9, 11.1, 18.2, 25.4, 26.6, 29.0, 30.4,
                29.0, 21.8, 20.4, 18.2, 15.0 );
        yearT[5] = new YearTemp(2014, 12.2, 14.1, 17.2, 25.0, 27.6, 29.1, 31.0,
                31.0, 24.0, 25.4, 21.0, 16.0 );



    }


    //getters and setters
    public YearTemp[] getYearT() {
        return yearT;
    }

    public void setYearT(YearTemp[] yearT) {
        this.yearT = yearT;
    }




}


