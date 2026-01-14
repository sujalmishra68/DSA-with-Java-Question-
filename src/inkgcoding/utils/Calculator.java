package src.inkgcoding.utils;

import src.inkgcoding.geometry.Circle;
import src.inkgcoding.geometry.Rectangle;
public class Calculator {
    public static void main(String[] args) {
       Circle cir = new Circle(7);
        Rectangle rec= new Rectangle(12, 10);

        double CirArea =Math.PI * Math.pow(cir.radius, 02);
        double  recArea = rec.width* rec.length;
        System.out.printf("area of the circle is: %s, Area of the Rectangle is : %f" ,CirArea ,recArea);
        }
}
