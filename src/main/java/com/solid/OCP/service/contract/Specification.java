package com.solid.OCP.service.contract;

public interface Specification<T> {

    boolean isSatisfied(T item);

}
