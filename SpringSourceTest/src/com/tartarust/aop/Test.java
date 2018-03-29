package com.tartarust.aop;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException{   
        IAbstractDefined abstractDefined = (IAbstractDefined)new DynaProxyAbstractDefined()
        .bind(new AbstractDefined(),new LoggerOperation());   
        abstractDefined.save("Double J");   
        abstractDefined.save("Float J");   
          
    }   
}
