package pl.javastart.task.client;

public class Offer {
    private boolean valid;
    private double value;
    private double percentage;

    Offer(boolean valid, double value, double percentage) {
        this.valid = valid;
        this.value = value;
        this.percentage = percentage;
    }

    public boolean isValid() {
        return valid;
    }

    private void setValid(boolean valid) {
        this.valid = valid;
    }

    public double getValue() {
        return value;
    }

    private void setValue(double value) {
        this.value = value;
    }

    public double getPercentage() {
        return percentage;
    }

    private void setPercentage(double percentage) {
        this.percentage = percentage;
    }

}
