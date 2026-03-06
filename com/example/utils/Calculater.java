package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculater {

	
	
	public static void main(String[] args) {

		Rectangle r = new Rectangle(4 ,5);
		Circle c = new Circle(5);
		
		int rectArea = r.length*r.breadth;
		int cirArea =(int)(c.radius*Math.PI*2);
		
		System.out.println(rectArea);
		System.out.println(cirArea);
		
	}
}
