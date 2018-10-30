package com.xie.designpattern.Strategy;

/**
 * 减法操作类
 */
public class OperationSub extends Operation {
    public double getResult(int numberA,int numberB){
        double result = 0;
        result = numberA - numberB;
        return  result;
    }
}
