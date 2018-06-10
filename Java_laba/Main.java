package com.company;

public class Main {
        public static void main(String[] args) {
            ChildrensCircle sun = new ChildrensCircle();
            ChildrensCircle sky = new ChildrensCircle(2,6,11,23);
            ChildrensCircle water = new ChildrensCircle(5,23,17,11,6);

            System.out.println(sun.toString());
            System.out.println(sky.toString());
            System.out.println(water.toString());

            sun.printSum();
            sky.printSum();
            water.printSum();

            water.printStaticSum();
        }
}
