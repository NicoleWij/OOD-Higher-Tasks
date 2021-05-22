package se.kth.iv1350.seminar4.view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * TotalRevenueFileOutput prints the total income since the program started to a file.
 */
class TotalRevenueFileOutput extends TotalRevenueDisplay {
    private PrintWriter logFile;
    
    /**
     * Generates a new instance of the TotalRevenueFileOutput class
     */
    TotalRevenueFileOutput() {
        try {
            logFile = new PrintWriter(new FileWriter("total-revenue.txt"), true);
        } catch (IOException ex) {
            System.out.println("Could not create logger.");
            ex.printStackTrace();
        }
    }

    @Override
    protected void doShowTotalIncome(double totalRevenue) {
        logFile.println("Total revenue: " + totalRevenue);
    }

    @Override
    protected void handleErrors(Exception e) {
        System.err.println("[FOR DEVELOPER]: Something went wrong when writing to the file\n" + e.getMessage());
        e.printStackTrace();
    }
}
