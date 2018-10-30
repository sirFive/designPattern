package com.xie.designpattern.Strategy;

/**
 * 乘法操作类
 */
public class OperationMul  extends Operation {
    public double getResult(int numberA,int numberB){
        double result = 0;
        result = numberA*numberB;
        return result;
    }
}
