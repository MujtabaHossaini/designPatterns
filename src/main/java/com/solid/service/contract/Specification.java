package com.solid.service.contract;

public interface Specification<T> {

    boolean isSatisfied(T item);

}
