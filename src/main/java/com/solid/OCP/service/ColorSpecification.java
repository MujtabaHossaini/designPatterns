package com.solid.OCP.service;

import com.solid.OCP.enums.Color;
import com.solid.OCP.model.Product;
import com.solid.OCP.service.contract.Specification;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ColorSpecification implements Specification<Product> {

    private Color color;

    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor() == color;
    }
}
