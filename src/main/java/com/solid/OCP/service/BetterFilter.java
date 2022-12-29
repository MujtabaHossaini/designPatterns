package com.solid.OCP.service;

import com.solid.OCP.model.Product;
import com.solid.OCP.service.contract.Filter;
import com.solid.OCP.service.contract.Specification;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements Filter<Product> {


    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(item -> spec.isSatisfied(item));
    }
}
