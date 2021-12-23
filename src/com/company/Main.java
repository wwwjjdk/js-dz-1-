package com.company;

public class Main {


    public static void main(String[] args) {
       // final BinaryOperator <Integer> sum = Integer::sum;
        // final BinaryOperator <Integer> sum = (a,b)or (int a, int b) -> a+b; or {a+b};
       // System.out.println(sum.apply(4,2));

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        }catch(ArithmeticException e){
            System.out.println("на ноль делить нельзя");
        }
        int z = calc.multiply.apply(2,2);
        int result = calc.pow.apply(z);
        calc.println.accept(result);


    }
}
