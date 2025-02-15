package com.driver;

public class Main {
    public static class Product {
        public int Product(int x, int y) {
            return x * y;
        }

        public int Product(int x, int y, int z) {
            return x * y * z;
        }

        public double Product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.Product(3,5));
        System.out.println(p.Product(3,6,4));
        System.out.println(p.Product(3.4,6.5));
    }
}