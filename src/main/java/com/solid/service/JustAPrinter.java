package com.solid.service;

import com.solid.model.Document;
import com.solid.service.contract.Printer;

public class JustAPrinter implements Printer {
    @Override
    public void Print(Document d) throws Exception {
        System.out.println("Just Printer");
    }
}
