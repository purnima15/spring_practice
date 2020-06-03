package com.practice.SpringProject;

import java.util.List;

public class Polygon {
	
	List<Point> Points;

	public List<Point> getPoints() {
		return Points;
	}

	public void setPoints(List<Point> points) {
		Points = points;
	}
	
	public void draw()
	{
		System.out.println("----------------Polygon---------------"); 
		for(Point point :Points)
		System.out.println("Point ("+point.getX()+","+point.getY()+")");
	
	}
	
	

}
