package com.practice.SpringProject;

import org.springframework.beans.factory.annotation.Autowired;

public class autowireDemo {

	Point p;
	Point q;

	


	
	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	
	public Point getQ() {
		return q;
	}

	public void setQ(Point q) {
		this.q = q;
	}


	public void draw()
	{
		System.out.println("----------------Autowire Demo---------------");
		System.out.println("Point A ("+getP().getX()+","+getP().getY()+")");
		System.out.println("Point B ("+getQ().getX()+","+getQ().getY()+")");	
	}

	
}
