package com.practice.SpringProject;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayBeanName implements BeanPostProcessor {
	
   public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("after initialization bean "+beanName);
	return bean;
}

   public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	   System.out.println("before initialization bean "+beanName);
	   return bean;
	}
   
}
