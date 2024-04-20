package pl.javastart.task.client;

import pl.javastart.task.config.Config;

public class SalesRepresentative {

    public Config config;

    public SalesRepresentative() {
        this.config = new Config();
    }

    public Offer createLoanOffer(int requestedAmount, int earnings) {
        Offer offer = new Offer(true, requestedAmount, config.getPercentage());
        if (earnings >= config.getMinRequiredEarnings()) {
            offer.getPercentage();
            offer.isValid();
            offer.getValue();
        }
        return offer;
    }

}
