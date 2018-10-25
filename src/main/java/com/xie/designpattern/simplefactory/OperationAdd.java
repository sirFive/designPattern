package com.xie.designpattern.simplefactory;

/**
 * 加法操作类
 */
public class OperationAdd extends Operation {

    public double getResult(){
        double result = numberA + numberB;
        return  result;
    }
}
