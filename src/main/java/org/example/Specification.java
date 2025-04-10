package org.example;

// Specification.java
public interface Specification<T> {
    boolean isSatisfiedBy(T t);
}