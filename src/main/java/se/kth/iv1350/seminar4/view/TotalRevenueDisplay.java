package se.kth.iv1350.seminar4.view;

import se.kth.iv1350.seminar4.model.SaleObserver;

/**
 * Test comment
 */
public abstract class TotalRevenueDisplay implements SaleObserver {

    private double totalRevenue;

    protected TotalRevenueDisplay() {
        totalRevenue = 0;
    }

    @Override
    public void newSale(double priceOfTheSale) {
        calculateTotalIncome(priceOfTheSale);

        showTotalIncome();
    }

    private void showTotalIncome() {
        try {
            doShowTotalIncome(totalRevenue);
        } catch(Exception e) {
            handleErrors(e);
        }
    }

    private void calculateTotalIncome(double priceOfPurchase) {
        totalRevenue += priceOfPurchase;
    }

    protected abstract void doShowTotalIncome(double totalRevenue);

    protected abstract void handleErrors(Exception e);
}
