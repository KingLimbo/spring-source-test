package com.limbo.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new  ClassPathXmlApplicationContext("application.xml");
        DriverManagerDataSource dataSource = (DriverManagerDataSource) context.getBean("dataSource");
        System.out.println(dataSource.getUrl());
    }
}
