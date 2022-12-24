package com.solid.service;

import com.solid.model.Document;
import com.solid.service.contract.IScanner;
import com.solid.service.contract.Printer;

public class Photocopier implements Printer, IScanner {
    @Override
    public void Scan(Document d) throws Exception {
        System.out.println("Photocopier has Scanner.");
    }

    @Override
    public void Print(Document d) throws Exception {
        System.out.println("Photocopier has Printer.");
    }
}
