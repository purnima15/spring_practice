package com.practice.SpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



/*using component annotation tells spring that we have to make this class as a Bean
 *  then we  do not have to give bean tag in XML file
 *  but the disadvantage of that is there can only be 1 instance 
 *  while can have multiple if use the XML bean tag.
 */


@Component
public class AnnotationsDemo {

	private Point p;
	private Point q;


	public Point getQ() {
		return q;
	}

	public void setQ(Point q) {
		this.q = q;
	}

	public Point getP1() {
		return p;
	}

	// Autowire first check by type in xml 
	//if there are multiple bean of same type then it looks for name
	//then it checks for qualifier
	
	@Autowired
	public void setP(Point p) {
		this.p = p;
	}
	
	public void draw()
	{
		System.out.println("----------------Annotation Demo---------------"); 
		System.out.println("Point A ("+getP1().getX()+","+getP1().getY()+")");
		//System.out.println("Point A ("+getQ().getX()+","+getQ().getY()+")");


	}
	
	
	//@Resource annotation is similar to Autowired
	
	//@postConstruct is similar to init
	
	//@predestroy is similar to destroy
	
}
