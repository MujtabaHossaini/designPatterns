package com.solid.isp.service;

import com.solid.isp.model.Document;
import com.solid.isp.service.contract.Printer;

public class JustAPrinter implements Printer {
    @Override
    public void Print(Document d) throws Exception {
        System.out.println("Just Printer");
    }
}
