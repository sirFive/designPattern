简单工厂模式的精髓在于：  
Operation类的属性和方法。OperationAdd和其它三个继承Operation,并重写Operation的方法。    
OperationFactory用于根据运算符new出相应的OperationAdd和其它三个类型的Operation实例。  
因为他们都重写了getResult()方法，所以所有的实例都能调用getResult()方法.