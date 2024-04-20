package pl.javastart.task.config;

public class Config {
    private int minRequiredEarnings = 2000;
    private double percentage = 0.03;

    public int getMinRequiredEarnings() {
        return minRequiredEarnings;
    }

    private void setMinRequiredEarnings(int minRequiredEarnings) {
        this.minRequiredEarnings = minRequiredEarnings;
    }

    public double getPercentage() {
        return percentage;
    }

    private void setPercentage(double percentage) {
        this.percentage = percentage;
    }

}
