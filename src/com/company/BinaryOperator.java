package com.company;
@FunctionalInterface
public interface BinaryOperator <T>{
    T apply(T a, T b);
}
