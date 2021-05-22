package se.kth.iv1350.seminar4.view;


/**
 * TotalRevenueView This class writes to the console when it's been notified
 */
class TotalRevenueView extends TotalRevenueDisplay {

    @Override
    public void doShowTotalIncome(double totalRevenue) throws Exception {
        System.out.println("A message from TotalRevenueObserver: ");
        System.out.println("Total revenue since the program started: " + totalRevenue + "\n");
    }

    @Override
    protected void handleErrors(Exception e) {
        System.err.println("Total revenue could not be displayed.");
        e.printStackTrace();
    }
}
