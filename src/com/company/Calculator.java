package com.company;
import java.util.function.Supplier;

public class Calculator {



    public Calculator(){

    }

    public static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y ;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x>0? x : x*-1;
    //заем бинарный для проверки

    Predicate<Integer> isPositive = x -> x > 0;// тру или фолс

    Consumer<Integer> println = System.out::println;// x1 -> System.out.println(x1);

}
