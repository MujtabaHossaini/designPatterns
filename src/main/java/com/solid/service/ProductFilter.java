package com.solid.service;

import com.solid.enums.Color;
import com.solid.enums.Size;
import com.solid.model.Product;

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
