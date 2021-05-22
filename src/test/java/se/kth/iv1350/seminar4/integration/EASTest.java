package se.kth.iv1350.seminar4.integration;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import se.kth.iv1350.seminar4.DTO.PaymentDTO;
import se.kth.iv1350.seminar4.DTO.SaleDTO;

public class EASTest {

    private EASHandler instance;
    private ByteArrayOutputStream printoutBuffer;
    private PrintStream originalSysOut;
    
    @Before
    public void setUp(){
        printoutBuffer = new ByteArrayOutputStream();
        PrintStream inMemSysOut = new PrintStream(printoutBuffer);
        originalSysOut = System.out;
        System.setOut(inMemSysOut);

        instance = new EASHandler();
    }

    @After
    public void tearDown(){
        printoutBuffer = null;
        System.setOut(originalSysOut);

        instance = null;
    }


    @Test
    public void enterItemPrintWhenExceptionIsThrown()
    {
        PaymentDTO payment = new PaymentDTO(0, null);
        SaleDTO sale = new SaleDTO(null, null, 0, 0);

        instance.registerPayment(payment, sale);

        String printOut = printoutBuffer.toString();
        String expectedOutput = "Registering the payment.";
        assertTrue("EASHandler did not start correctly.", printOut.contains(expectedOutput));
    } 
}
