package com.solid.service;

import com.solid.service.contract.Specification;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AndSpecification<T> implements Specification<T> {

    private Specification<T> first, second;

    @Override
    public boolean isSatisfied(T item) {
        return this.first.isSatisfied(item) && this.second.isSatisfied(item);
    }
}
