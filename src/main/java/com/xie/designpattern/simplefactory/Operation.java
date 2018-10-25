package com.xie.designpattern.simplefactory;

/**
 * 操作基类
 */
public class Operation {
    double numberA;
    double numberB;
     public double getResult(){
         double result = 0;
         return result;
     }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
