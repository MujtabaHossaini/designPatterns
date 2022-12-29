package com.solid.ISP.service;

import com.solid.ISP.model.Document;
import com.solid.ISP.service.contract.IScanner;
import com.solid.ISP.service.contract.Printer;

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
