package se.kth.iv1350.seminar4.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * PrintWriterInheritance
 */
public class PrintWriterInheritance extends PrintWriter {

    /**
     * Creates a new instance of the PrintWriterInheritance class
     * @throws IOException if the named file exists but is a directory rather than a
     * regular file.
     */
    public PrintWriterInheritance() throws IOException {
        super(new FileWriter("total-revenue-inheritance.txt"), true);
    }
    

    @Override
    public void println(String message) {
        LocalTime timeOfWrite = LocalTime.now();
        LocalDate dateOfWrite = LocalDate.now();
        super.println("Print from date: " + dateOfWrite + "\nTime: " + timeOfWrite.getHour() + ":" + timeOfWrite.getMinute() + " \n" + message);
    }
}
