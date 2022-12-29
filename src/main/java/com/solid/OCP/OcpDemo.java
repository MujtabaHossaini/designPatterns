package com.solid.OCP;

import com.solid.OCP.enums.Color;
import com.solid.OCP.enums.Size;
import com.solid.OCP.model.Product;
import com.solid.OCP.service.*;

import java.util.List;

public class OcpDemo {

    public static void main(String[] args) {


        //************************Before********************************

        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);

        ProductFilter filter = new ProductFilter();
        System.out.println("Green products (old): ");
        filter.filterByColor(products, Color.GREEN).forEach(System.out::println);


        //*************************After*******************************
        BetterFilter bf = new BetterFilter();
        System.out.println("Green products (new):");
        bf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.getName() + " is green"));

        System.out.println("Large products:");
        bf.filter(products, new SizeSpecification(Size.LARGE))
                .forEach(p -> System.out.println(" - " + p.getName() + " is large"));

        System.out.println("Large blue items:");
        bf.filter(products,
                        new AndSpecification<>(
                                new ColorSpecification(Color.BLUE),
                                new SizeSpecification(Size.LARGE)
                        ))
                .forEach(p -> System.out.println(" - " + p.getName() + " is large and blue"));


    }



}
