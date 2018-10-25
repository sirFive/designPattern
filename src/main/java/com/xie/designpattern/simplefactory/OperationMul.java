package com.xie.designpattern.simplefactory;

/**
 * 乘法操作类
 */
public class OperationMul  extends Operation{
    public double getResult(){
        double result = 0;
        result = numberA*numberB;
        return result;
    }
}
