package by.stqa.pft.sandbox;

/**
 * Created by kerku on 03.09.2019
 */

public class Rectangle {

    double a;
    double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double area() {
        return this.a * this.b;
    }
}
