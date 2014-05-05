package com.domain;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.err.println("---start---");
		ServiceLoader<Employee> s = ServiceLoader.load(Employee.class);
		
		Iterator<Employee> employees = s.iterator();
		if (employees.hasNext()) {
			Employee curEmployee = employees.next();
			curEmployee.work();
		}		
		System.err.println("---end---");
    }
}
