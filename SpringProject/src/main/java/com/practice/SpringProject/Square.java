package com.practice.SpringProject;

public class Square implements Shape {
	
	Point PointA;
	Point PointB;
	Point PointC;
	Point PointD;
	public Point getPointA() {
		return PointA;
	}
	public void setPointA(Point pointA) {
		PointA = pointA;
	}
	public Point getPointB() {
		return PointB;
	}
	public void setPointB(Point pointB) {
		PointB = pointB;
	}
	public Point getPointC() {
		return PointC;
	}
	public void setPointC(Point pointC) {
		PointC = pointC;
	}
	public Point getPointD() {
		return PointD;
	}
	public void setPointD(Point pointD) {
		PointD = pointD;
	}
	
	public void draw()
	{
		System.out.println("----------------Square---------------");
		System.out.println("Point A ("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("Point B ("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("Point C ("+getPointC().getX()+","+getPointC().getY()+")");
		System.out.println("Point D ("+getPointD().getX()+","+getPointD().getY()+")");		
	}

}
