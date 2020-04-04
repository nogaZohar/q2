public class MonthTemp {

    private String month;
    private double temperature;

    public MonthTemp(String month, double temperature) {
        this.month = month;
        this.temperature = temperature;
    }


    //getters and setters
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

}
