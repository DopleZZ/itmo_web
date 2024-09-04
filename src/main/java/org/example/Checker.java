package org.example;

public class Checker {

    Float x;
    Float y;
    Float r;

    public Checker(Float x, Float y, Float r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Boolean checkCircle() {
        Float vec = 123494350435093.0F;
        if ((x > 0 & y < 0) & (x < r & y > -r)) {

            vec = (float) Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
            System.out.println(vec);
        }
        return vec < r;
    }

    public Boolean checkPram() {
        return (y<r & y>0) & (x<0 & x>(r/2));
    }

    public Boolean checkTriangle(){

        Float a = r;
        Float c = r;
        Float b = (float) Math.sqrt((a*a+c*c));
        Float d = (float) Math.sqrt(x*x+((y-r)*(y-r)));
        Float e = (float) Math.sqrt(((x-r)*(x-r))+(y*y));
        Float f = (float) Math.sqrt(x*x+y*y);

        Float p1 = (float) (0.5 * (a+d+f));
        Float p2 = (float) (0.5 * (d+b+e));
        Float p3 = (float) (0.5 * (f+e+c));

        Float s1 = (float) Math.sqrt(p1*(p1-a)*(p1-d)*(p1-f));
        Float s2 = (float) Math.sqrt(p2*(p2-d)*(p2-e)*(p2-b));
        Float s3 = (float) Math.sqrt(p3*(p3-f)*(p3-c)*(p3-e));

        return (s1+s2+s3) == ((a*c)/2);
    }
}
