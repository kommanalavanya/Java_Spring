package com.jobiak.auto;

public class Line {
  private Point a;
  private Point b;
  public Line() {
	// TODO Auto-generated constructor stub
}
public Line(Point a, Point b) {

	this.a = a;
	this.b = b;
}
public Point getA() {
	return a;
}
public void setA(Point a) {
	this.a = a;
}
public Point getB() {
	return b;
}
public void setB(Point b) {
	this.b = b;
}
@Override
public String toString() {
	return "Line [a=" + a + ", b=" + b + "]";
}
public void draw() {
	System.out.println(a+"to "+b);
} 
}
