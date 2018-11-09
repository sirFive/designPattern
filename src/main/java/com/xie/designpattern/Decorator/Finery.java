package com.xie.designpattern.Decorator;

/**
 * 装饰器
 * 服饰类,用于装饰人
 */
public class Finery  implements Component {

    protected Component component;

    public void show(){
        if (component != null){
            component.show();
        }else {
            System.out.println("component is null");
        }
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
