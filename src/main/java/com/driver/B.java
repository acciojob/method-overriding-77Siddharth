package com.driver;

class A{
    String meth(){
        return "Invoking method from class A";
    }
}

public class B extends A{
    public B() {
        meth();
    }

    @Override
    String meth() {
        return "Method is overridden in Extendend class B";
    }
}