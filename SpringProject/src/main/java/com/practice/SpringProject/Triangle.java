package com.practice.SpringProject;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Triangle implements ApplicationContextAware, BeanNameAware ,InitializingBean , DisposableBean,ApplicationEventPublisherAware {

	private String type;
	private int height;
	private ApplicationContext context;
	private ApplicationEventPublisher publisher;
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	public Triangle(int height) {
		super();
		this.height = height;
	}
	
	public void draw()
	{
		
		System.out.println("----------------Triangle---------------");

		System.out.println(getType()+" Triangle Drawn of height "+height);
		
		DrawEvent drawevent= new DrawEvent(this);
		publisher.publishEvent(drawevent);
		
	}


	public void setBeanName(String beanName) {
			System.out.println("Bean Name :"+beanName);
	}


	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		
	}
	 //this is unimplemented methods of disposabledestruction,this is called at time of bean initialization

	public void destroy() throws Exception {
		System.out.println("called at time of destoy of triangle");
		
	}

	  //this is unimplemented methods of initializingbean,this is called at time of bean initialization

	public void afterPropertiesSet() throws Exception {
		System.out.println("called at time of init of triangle");
		
	}

	  //this is my own method which is configured in XML file,this is called at time of bean initialization
		public void cleanUp() throws Exception {
			System.out.println("called at time of destoy of triangle");
			
		}


	 //this is my own method which is configured in XML file,this is called at time of bean initialization
		public void myInit() throws Exception {
			System.out.println("called at time of init of triangle");
			
		}


	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher=publisher;
		
	}

	
}
