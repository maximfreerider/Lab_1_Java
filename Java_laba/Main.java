package com.company;

public class Main {
        public static void main(String[] args) {
            ChildrensCircle Sun = new ChildrensCircle();
            ChildrensCircle Sky = new ChildrensCircle(2,6,11,23);
            ChildrensCircle Water = new ChildrensCircle(5,23,17,11,6);

            System.out.println(Sun.toString());
            System.out.println(Sky.toString());
            System.out.println(Water.toString());

            Sun.printSum();
            Sky.printSum();
            Water.printSum();

            Water.printStaticSum();
        }
}
