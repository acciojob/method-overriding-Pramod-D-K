package com.driver;

public class Main {
     public static class A{
        public void meth(){
            System.out.println("Invoking method from class A");
        }
    }
     public static class B extends A{
        public void meth(){
            System.out.println("Method is overridden in Extended class B");
        }
    }
    public static void main(String[] args) {
        B b1 =new B();
        b1.meth();
        B b2 = new B();
        b2.meth();


    }
}
