package com.xie.designpattern.simplefactory;

/**
 * 减法操作类
 */
public class OperationSub extends Operation {
    public double getResult(){
        double result = 0;
        result = numberA - numberB;
        return  result;
    }
}
