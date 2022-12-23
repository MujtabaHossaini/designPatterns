package com.solid.service;

import com.solid.enums.Size;
import com.solid.model.Product;
import com.solid.service.contract.Specification;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SizeSpecification implements Specification<Product> {

    private Size size;

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize() == size;
    }
}
