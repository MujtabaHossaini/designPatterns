package com.solid.isp.service.contract;

import com.solid.isp.model.Document;

public interface Machine {

    void print(Document d);
    void fax(Document d) throws Exception;
    void scan(Document d) throws Exception;

}
