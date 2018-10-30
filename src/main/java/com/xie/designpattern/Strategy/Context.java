package com.xie.designpattern.Strategy;

public class Context {
    Operation operation;
    public  Context(Operation operation){
        this.operation = operation;
    }
    public double contextInterface(int numberA,int numberB ){
        return operation.getResult(numberA,numberB);
    }
}
