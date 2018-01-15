package net.pritesh.patterns.behavioral.state;

public class PrinterOffState extends PrinterState
{
    private Printer printer;


    public PrinterOffState(Printer printer)
    {
        this.printer = printer;
    }

    @Override
    public void handleRequest()
    {
        printer.setState(printer.getPrinterHeatingState());
        //return "Heating";
    }

    public String toString()
    {
        return "Printer is off";
    }

}
