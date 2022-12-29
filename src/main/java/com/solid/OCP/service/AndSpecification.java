package com.solid.OCP.service;

import com.solid.OCP.service.contract.Specification;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AndSpecification<T> implements Specification<T> {

    private Specification<T> first, second;

    @Override
    public boolean isSatisfied(T item) {
        return this.first.isSatisfied(item) && this.second.isSatisfied(item);
    }
}
