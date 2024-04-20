package pl.javastart.task.Representative;

import pl.javastart.task.Config.Config;
import pl.javastart.task.Offer.Offer;

public class SalesRepresentative {

    public Config config;

    public SalesRepresentative() {
        this.config = new Config();
    }

    public Offer createLoanOffer(int requestedAmount, int earnings) {
        Offer offer = new Offer();
        if (earnings >= config.getMinRequiredEarnings()) {
            offer.getPercentage() = config.getPercentage();
            offer.isValid() = true;
            offer.getValue() = requestedAmount;
        }
        return offer;
    }

}
