package net.pritesh.patterns.behavioral.state;

public class PrinterHeatingState extends PrinterState
{
    private Printer printer;


    public PrinterHeatingState( Printer printer )
    {
        this.printer = printer;
    }

    @Override
    public void handleRequest()
    {
        printer.setState(printer.getPrinterPrintingState());
        //return "Heating";
    }

    public String toString()
    {
        return "Printer is heating";
    }
}
