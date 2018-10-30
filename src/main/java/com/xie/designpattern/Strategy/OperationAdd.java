package com.xie.designpattern.Strategy;

/**
 * 加法操作类
 */
public class OperationAdd extends Operation {

    public double getResult(int numberA,int numberB){
        double result = numberA + numberB;
        return  result;
    }
}
