package com.driver;
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        String string = obj.meth(); // This will output: "Method is overridden in Extended class B"
    }
}