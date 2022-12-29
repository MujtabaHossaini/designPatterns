package com.solid.ISP.service;

import com.solid.ISP.model.Document;
import com.solid.ISP.service.contract.Machine;

public class MultiFunctionPrinter implements Machine {
    @Override
    public void print(Document d) {

    }

    @Override
    public void fax(Document d) throws Exception {

    }

    @Override
    public void scan(Document d) throws Exception {

    }
}
