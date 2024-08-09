package com.driver;
public class Main {
    public static void main(String[] args) {

        B object =new B();
        String Ans =object.meth();
        System.out.println(Ans);
    }
}
class A{
     String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
     String meth(){
        return "Method is overridden in Extendend class B";
    }
}