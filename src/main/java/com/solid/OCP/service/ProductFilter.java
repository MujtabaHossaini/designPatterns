package com.solid.OCP.service;

import com.solid.OCP.enums.Color;
import com.solid.OCP.enums.Size;
import com.solid.OCP.model.Product;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    public Stream<Product> filterByColor(List<Product> products, Color color)
    {
        return products.stream().filter(product -> product.getColor() == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size)
    {
        return products.stream().filter(product -> product.getSize() == size);
    }

    public Stream<Product> filterBySizeAndProduct(List<Product> products, Size size, Color color)
    {
        return products.stream().filter(product -> product.getSize() == size
                && product.getColor() == color );
    }

}
