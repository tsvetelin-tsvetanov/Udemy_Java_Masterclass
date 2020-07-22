package com.company;

public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double distance = Math.sqrt
                (((0 - this.x) * (0 - this.x)) + ((0 - this.y) * (0 - this.y)));
        return distance;
    }

    public double distance(int  x, int  y){
        double distance = Math.sqrt
                (((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y)));
        return distance;
    }

    public double distance(Point point){
        double distance = Math.sqrt
                (((point.x - this.x) * (point.x - this.x))
                        + ((point.y - this.y) * (point.y - this.y)));
        return distance;
    }
}
