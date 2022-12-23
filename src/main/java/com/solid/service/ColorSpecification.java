package com.solid.service;

import com.solid.enums.Color;
import com.solid.model.Product;
import com.solid.service.contract.Specification;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ColorSpecification implements Specification<Product> {

    private Color color;

    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor() == color;
    }
}
