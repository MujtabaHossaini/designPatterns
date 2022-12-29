package com.solid.ISP.service;

import com.solid.ISP.model.Document;
import com.solid.ISP.service.contract.Printer;

public class JustAPrinter implements Printer {
    @Override
    public void Print(Document d) throws Exception {
        System.out.println("Just Printer");
    }
}
