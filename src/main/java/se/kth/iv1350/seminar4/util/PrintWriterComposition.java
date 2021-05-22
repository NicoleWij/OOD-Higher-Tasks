package se.kth.iv1350.seminar4.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 
 */
public class PrintWriterComposition {
    private PrintWriter writer;

    public PrintWriterComposition() throws IOException {
        writer = new PrintWriter(new FileWriter("total-revenue-composition.txt"), true);
    }

    public void println(String message) {
        LocalTime timeOfWrite = LocalTime.now();
        LocalDate dateOfWrite = LocalDate.now();
        writer.println("Print from date: " + dateOfWrite + "\nTime: " + timeOfWrite.getHour() + ":" + timeOfWrite.getMinute() + " \n" + message);
    }
    
}
