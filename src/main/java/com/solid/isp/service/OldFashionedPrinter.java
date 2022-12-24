package com.solid.isp.service;

import com.solid.isp.model.Document;
import com.solid.isp.service.contract.Machine;

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
