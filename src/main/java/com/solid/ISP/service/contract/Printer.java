package com.solid.ISP.service.contract;

import com.solid.ISP.model.Document;

public interface Printer {

    void Print(Document d) throws Exception;

}
