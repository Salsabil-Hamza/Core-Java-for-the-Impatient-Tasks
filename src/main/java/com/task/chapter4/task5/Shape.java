package com.task.chapter4.task5;

public abstract class Shape {

    protected Point point;

    public Shape(double x,double y){
        point = new Point(x,y);
    }

    public Shape(Point point){
        this.point = point;
    }

    public void moveBy(double dx, double dy){
        point = new Point(point.getX()+dx,point.getY()+dy);
    }

    public abstract Point getCenter();



}
