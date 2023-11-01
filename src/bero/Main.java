package bero;

import bero.calc.Calculator;
import bero.worker.Worker;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(2, 2);
        int b = calc.minus.apply(5, 1);
        int c = calc.divide.apply(a, b);

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);

        Worker worker = new Worker(System.out::println, System.out::println);
        worker.start();

    }
}