package se.kth.iv1350.seminar4.view;

import java.io.IOException;

import se.kth.iv1350.seminar4.util.PrintWriterComposition;
import se.kth.iv1350.seminar4.util.PrintWriterInheritance;

/**
 * TotalRevenueFileOutput prints the total income since the program started to a file.
 */
class TotalRevenueFileOutput extends TotalRevenueDisplay {
    private PrintWriterComposition logFileComp;
    private PrintWriterInheritance logFileInherit;
    
    /**
     * Generates a new instance of the TotalRevenueFileOutput class
     */
    TotalRevenueFileOutput() {
        try {
            logFileComp = new PrintWriterComposition();
            logFileInherit = new PrintWriterInheritance();
        } catch (IOException ex) {
            System.out.println("[FOR DEVELOPER]: Could not create logger.");
            ex.printStackTrace();
        }
    }

    @Override
    protected void doShowTotalIncome(double totalRevenue) throws Exception{
        logFileComp.println("Total Revenue: " + totalRevenue);
        logFileInherit.println("Total revenue: " + totalRevenue);
    }

    @Override
    protected void handleErrors(Exception e) {
        System.err.println("[FOR DEVELOPER]: Something went wrong when writing to the file\n" + e.getMessage());
        e.printStackTrace();
    }
}
