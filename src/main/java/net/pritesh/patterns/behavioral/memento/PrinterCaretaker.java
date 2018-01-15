package net.pritesh.patterns.behavioral.memento;

import java.util.Stack;

public class PrinterCaretaker
{
    private Stack<PrinterSettingMemento> settingsHistory = new Stack<>();

    public void save(PrinterSetting setting)
    {
        settingsHistory.push(setting.save());
    }

    public void revert(PrinterSetting setting)
    {
        setting.revert(settingsHistory.pop());
    }
}
