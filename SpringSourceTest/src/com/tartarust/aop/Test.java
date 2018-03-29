package com.tartarust.aop;

/**
 * 测试类
 * @author LF
 *
 */
public class Test {

	/**
	 * 主方法
	 * 
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException{   
		// 绑定该类实现的所有接口
        IAbstractDefined abstractDefined = (IAbstractDefined)new DynaProxyAbstractDefined()
        	.bind(new AbstractDefined(),new LoggerOperation()); 
        // save方法
        abstractDefined.save("Double J");   
//        abstractDefined.save("Float J");   
          
    }   
}
