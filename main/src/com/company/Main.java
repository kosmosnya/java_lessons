package com.company;


public class Main {

    public static void main(String[] args) {
        Point a = new Point(20, 30);
        Point b = new Point(3.0, 3.0);
        Line c = new Line(a, b);
        Line[] d = foo(c, a);

       System.out.println(c.toSvg());

        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i].toSvg());
        }
    }

        static Line[] foo(Line l, Point p) {
            double a = (l.getP1().y - l.getP2().y) / (l.getP1().x - l.getP2().x);
            double a2 = -1/a;
            double b2 = p.y - (a2 * p.x);
            double r = l.distance();
            double wzr = Math.sqrt(-p.y*p.y + (2*a2*p.x + 2*b2)*p.y-a2*p.x*p.x*a2-2*a2*b2*p.x+(a2*a2+1)*r*r-b2*b2);
            double x = -(wzr - a2*p.y-p.x+a2*b2)/(a2*a2+1);
            double y = -(wzr * a2-a2*a2*p.y-a2*p.x-b2)/(a2*a2+1);

            double x1 = (wzr + a2*p.y+p.x-a2*b2)/(a2*a2+1);
            double x2 = (wzr * a2+a2*a2*p.y+a2*p.x+b2)/(a2*a2+1);
            return new Line[]{new Line(p, new Point(x, y)), new Line(p, new Point(x1, x2))};
        }
}