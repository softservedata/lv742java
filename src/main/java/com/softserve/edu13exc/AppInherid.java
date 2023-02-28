package com.softserve.edu13exc;


import java.io.IOException;

class Base {
    public void doSomething() throws IOException {
        System.out.println("Base");
    }
}

class Child extends Base {
    @Override
    //public void doSomething() throws Exception { // Compile Error
    //public void doSomething() throws IOException {  // Ok
    public void doSomething() {  // Ok
        System.out.println("Child");
        //super.doSomething();
    }
}


public class AppInherid {
    public static void main(String[] args) {
        Child child = new Child();
        try {
            child.doSomething();
        //} catch (IOException e) { // Compile Error
        } catch (Exception e) { // OK
            throw new RuntimeException(e);
        }
    }
}
