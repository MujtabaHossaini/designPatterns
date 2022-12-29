package com.solid.ISP.service.contract;

import com.solid.ISP.model.Document;

public interface IScanner {

    void Scan(Document d) throws Exception;

}
