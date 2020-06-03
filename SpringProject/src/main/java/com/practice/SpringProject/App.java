package com.practice.SpringProject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App  
{
    //private static ApplicationContext context;

    private static AbstractApplicationContext context;

	public static void main( String[] args )
    {
    	//Triangle triangle=new Triangle();
    	
    	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	//Triangle tr1 = (Triangle)factory.getBean("triangle");

    	context = new ClassPathXmlApplicationContext("spring.xml");
    	context.registerShutdownHook();
    	Triangle tr1 = (Triangle)context.getBean("triangle");
    	tr1.draw();
    	
    	Shape Sq1 = (Shape)context.getBean("Circle");
    	Sq1.draw();
    	Shape Sq2 = (Shape)context.getBean("Square1");
    	Sq2.draw();
    	
    	Polygon p1 = (Polygon)context.getBean("Polygon1");
    	p1.draw();
    	

    	AnnotationsDemo an = (AnnotationsDemo)context.getBean("annotationsDemo");
    	an.draw();
    	
    	autowireDemo au1 = (autowireDemo)context.getBean("autoWDemo");
    	au1.draw();
    	
    	//to get the message for message resources
    	System.out.println(context.getMessage("message1", null, "defaultMessage", null));
    	
    
    }
}
