package com.company;


import java.util.Locale;

public class Line {
    private  Point p1;
    private  Point p2;


    public Line(Point p1, Point p2) {

        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }


    public double distance() {


        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public String toSvg() {
        return String.format(Locale.ENGLISH, "<line x1=\"%f\" y1=\"%f\" x2=\"%f\" y2=\"%f\" style=\"stroke:rgb(255,0,0);stroke-width:2\"/>", p1.x, p1.y, p2.x, p2.y);
    }

}
