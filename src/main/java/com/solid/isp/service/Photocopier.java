package com.solid.isp.service;

import com.solid.isp.model.Document;
import com.solid.isp.service.contract.IScanner;
import com.solid.isp.service.contract.Printer;

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
