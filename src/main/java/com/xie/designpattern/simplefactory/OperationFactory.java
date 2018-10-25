package com.xie.designpattern.simplefactory;

public class OperationFactory {
    public static Operation getOperation(String operator){
        double result = 0;
        Operation operation = null;
        switch (operator){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                break;
        }
        return operation;
    }
}
