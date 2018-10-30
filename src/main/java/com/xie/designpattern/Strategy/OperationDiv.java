package com.xie.designpattern.Strategy;

/**
 * 除法操作类
 */
public class OperationDiv extends Operation {
    public double getResult(int numberA,int numberB){
        double result = 0 ;
        if(numberB !=0){
            result = numberA / numberB;
        }
        return result;
    }
}
