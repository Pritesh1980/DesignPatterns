package net.pritesh.patterns.behavioral.state;

public class PrinterPrintingState extends PrinterState
{
    private Printer printer;

    public PrinterPrintingState( Printer printer )
    {
        this.printer = printer;
    }

    @Override
    public void handleRequest()
    {
        printer.setState(printer.getPrinterOffState());
        //return "Heating";
    }

    public String toString()
    {
        return "Printer is printing";
    }
}
