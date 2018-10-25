package com.xie.designpattern.simplefactory;

/**
 * 除法操作类
 */
public class OperationDiv extends Operation{
    public double getResult(){
        double result = 0 ;
        if(numberB !=0){
            result = numberA / numberB;
        }
        return result;
    }
}
