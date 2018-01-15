package net.pritesh.patterns.behavioral.state;

public class Printer
{
    // States
    private PrinterState printerOffState;
    private PrinterState printerHeatingState;



    private PrinterState printerPrintingState;

    private PrinterState state;

    public Printer()
    {
        printerOffState = new PrinterOffState(this);
        printerHeatingState = new PrinterHeatingState(this);
        printerPrintingState = new PrinterPrintingState(this);

        state = printerOffState;
    }

    public void progress()
    {
        state.handleRequest();
    }

    public String toString()
    {
        return state.toString();
    }

    public PrinterState getPrinterHeatingState()
    {
        return printerHeatingState;
    }


    public PrinterState getPrinterOffState()
    {
        return printerOffState;
    }

    public PrinterState getPrinterPrintingState()
    {
        return printerPrintingState;
    }

    public void setState( PrinterState state )
    {
        this.state = state;
    }
}
