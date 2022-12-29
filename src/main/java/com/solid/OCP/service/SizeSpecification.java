package com.solid.OCP.service;

import com.solid.OCP.enums.Size;
import com.solid.OCP.model.Product;
import com.solid.OCP.service.contract.Specification;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SizeSpecification implements Specification<Product> {

    private Size size;

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize() == size;
    }
}
