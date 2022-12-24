package com.solid.isp.service.contract;

import com.solid.isp.model.Document;

public interface Printer {

    void Print(Document d) throws Exception;

}
