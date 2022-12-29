package com.solid.ISP.service;

import com.solid.ISP.model.Document;
import com.solid.ISP.service.contract.Machine;

public class OldFashionedPrinter implements Machine {
    @Override
    public void print(Document d) {
        // yep
    }

    @Override
    public void fax(Document d) throws Exception {
        throw new Exception();
    }

    @Override
    public void scan(Document d) throws Exception {
        throw new Exception();
    }
}
