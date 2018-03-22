package com.company;

public class Main {

    public static void main(String[] args) {
        int a1 = 10;
        int a2 = 10;
        Integer b1 = 20;
        Integer b2 = 20;
        Integer c1 = 200;
        Integer c2 = 200;

        System.out.println(String.format("%d?=%d:%b", a1, a2, a1==a2));
        System.out.println(String.format("%d?=%d:%b", b1, b2, b1==b2));
        System.out.println(String.format("%d?=%d:%b", c1, c2, c1==c2));
        System.out.println(String.format("%d?=%d:%b", a1*b1, c1, a1*b1==c1));
        System.out.println(String.format("%d?=%d:%b", c1/b1, a1, c1/b1==a1));

        FooSize fooSize = new FooSize();
        System.out.println(fooSize.size);
        fooSize.setSize(40);
        System.out.println(fooSize.size);
    }
}
