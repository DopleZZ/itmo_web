package org.example;
import org.example.Checker;

import org.w3c.dom.ls.LSOutput;


public class Main {
    public static void main(String[] args) {


        Float x = Float.valueOf(System.getenv("x"));
        Float y = Float.valueOf(System.getenv("y"));
        Float r = Float.valueOf(System.getenv("r"));

        System.out.println(x);
        System.out.println(y);
        System.out.println(r);

        Checker ch = new Checker(x,y,r);

        if (ch.checkPram()){System.out.println("прям");}
        if (ch.checkCircle()){System.out.println("круг");}
        if (ch.checkTriangle()){System.out.println("треугольник");}
    }
}